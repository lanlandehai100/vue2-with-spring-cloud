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
        hiddenQRcodeView() {
            document.getElementById('hiddenQRcode').style.display='block';
            document.getElementById('hiddenPic').style.display='block';
        },
        hiddenQRcodeHidden(){
            document.getElementById('hiddenQRcode').style.display='none';
            document.getElementById('hiddenPic').style.display='none';
        }
    },
    mounted() {
        $("nav .nav .PMenu").hover(function(){
            var $t=$(this);
            var $obj=$t.find(".navboxBase");
            $obj.css({"left":-$t.offset().left+"px","width":$("body").width()});
            // if($IsLoser){
                 $obj.show();
            // }else{
            //     $obj.stop(true,false).fadeIn(588,"easeOutQuart");
            // }
        },function(){
            $(this).find('.navboxBase').hide(); 
        });
        $(".zfk a.top").click(function(){
            $("html,body").stop().animate({scrollTop: 0}, 888,"easeOutQuart");
        });
    },
    '$route' (to, from) {

    }
}
