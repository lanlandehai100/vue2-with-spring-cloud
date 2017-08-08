package com.taoweilai.user.common.utils;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.apache.log4j.Logger;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class RedisCache implements Cache {
	
	private static final Logger logger = Logger.getLogger(RedisCache.class);
	
	private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private final String id; //cache instance id;
	private RedisTemplate redisTemplate;
	
	private static final long EXPIRE_TIME_IN_MINUTES = 30; //redis 超时时间
	
	public RedisCache(String id){
		if(id == null){
			throw new IllegalArgumentException("Cache instances require an ID");
		}
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void putObject(Object key, Object value) {
		try{
			RedisTemplate redisTemplate = getRedisTemplate();
			ValueOperations opsForValue = redisTemplate.opsForValue();
			opsForValue.set(key, value, EXPIRE_TIME_IN_MINUTES, TimeUnit.MINUTES);
			logger.debug("Put query result to redis");
		}catch(Throwable t){
			logger.error("Redis put failed" , t);
		}
	}

	private RedisTemplate getRedisTemplate() {
		if(redisTemplate == null){
			redisTemplate = ApplicationContextHolder.getBean("redisTemplate");
		}
		return redisTemplate;
	}

	@Override
	public Object getObject(Object key) {
		try{
			RedisTemplate redisTemplate = getRedisTemplate();
			ValueOperations opsForValue = redisTemplate.opsForValue();
			logger.debug("Get cached query result from redis");
			return opsForValue.get(key);
		}catch(Throwable t){
			logger.error("Redis get failed,fail over to db" , t);
			return null;
		}
	}

	@Override
	public Object removeObject(Object key) {
		try{
			RedisTemplate redistTemplate = getRedisTemplate();
			redisTemplate.delete(key);
			logger.debug("Remove cached query result from redis");
		}catch(Throwable t){
			logger.error("Redis remove failed" , t);
		}
		return null;
	}

	@Override
	public void clear() {
		RedisTemplate redistTemplate = getRedisTemplate();
		redisTemplate.execute((RedisCallback) connection -> {
			connection.flushDb();
			return null;
		});
		logger.debug("clear all the cached query result from redis");
	}

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public ReadWriteLock getReadWriteLock() {
		return readWriteLock;
	}

}
