import {
    gbs
} from 'config/settings.js';

import $ from 'jquery';

export default {
    name: 'taoweilaihome',
    data() {
        return {
            bannerPic: [require("../../../../assets/images/banner-pic01.jpg"),require("../../../../assets/images/banner-pic03.jpg")]
        }
    },
    methods: {
    },
    mounted() {
        $("nav .nav .PMenu").hover(function(){
            var $t=$(this);
            var $obj=$t.find(".navboxBase");
           $obj.css({"left":-$t.offset().left+"px","width":$("body").width()});
            // if($IsLoser){
                 $obj.fadeIn(580);
            // }else{
            //     $obj.stop(true,false).fadeIn(588,"easeOutQuart");
            // }
        },function(){
            $(this).find('.navboxBase').hide(); 
        });
        $(".zfk a.top").click(function(){
            $("html,body").stop().animate({scrollTop: 0}, 888,"easeOutQuart");
        });
        $(".office-pic").mouseover(function(){
            $("#hiddenQRcode").show();
            $("#hiddenPic").show();
          //  document.getElementById('hiddenQRcode').style.display='block';
           // document.getElementById('hiddenPic').style.display='block';
        });
        $(".office-pic").mouseout(function(){
            $("#hiddenQRcode").hide();
            $("#hiddenPic").hide();
          //  document.getElementById('hiddenQRcode').style.display='none';
          //  document.getElementById('hiddenPic').style.display='none';
        });
        $(".indexNews .notice .tab-hd li").mouseover(function(e){
		var $t=$(this);
		if(!$t.hasClass("active")){
			var $objs=$t.siblings();
			$objs.removeClass("active");
			$t.addClass("active");
		    var $objsA=$(".indexNews .notice .tab-bd");
            $(".indexNews .notice .tab-bd.active").removeClass("active");
            $objsA.eq($t.index()).hide();
			$objsA.eq($t.index()).addClass("active");
            $objsA.eq($t.index()).fadeIn(580);
		}
	});
    },
    '$route' (to, from) {

    }
}
