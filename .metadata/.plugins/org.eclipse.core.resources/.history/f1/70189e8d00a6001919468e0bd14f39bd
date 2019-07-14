<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=313dc2a3dad52079f42012b67c645f76&libraries=services"></script>
<title>Insert title here</title>
</head>
<body>

<div id="map" style="width:500px;height:400px;"></div>
	
	
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(37.54699, 127.09598), // 지도의 중심좌표
        level: 13 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

//주소-좌표 변환 객체를 생성합니다
var geocoder = new kakao.maps.services.Geocoder();

// 마커이미지의 주소입니다    
var imageSrc = "http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/marker_red.png", 
    imageSize = new kakao.maps.Size(64, 69), // 마커이미지의 크기입니다
    imageOption = {offset: new kakao.maps.Point(27, 69)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.
      
    var marker = new kakao.maps.Marker(); // 마커    
    
 var infowindow = new kakao.maps.InfoWindow({zindex:1}); //클릭한 위치에 대한 주소를 표시할 인포윈도우입니다

    var markerImage = new kakao.maps.MarkerImage(
    	    'http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/marker_red.png',
    	    new kakao.maps.Size(31, 35), new kakao.maps.Point(13, 34));
 
 // 현재 지도 중심좌표로 주소를 검색해서 지도 좌측 상단에 표시합니다
    searchAddrFromCoords(map.getCenter(), displayCenterInfo);
 
	//위도,경도 변수선언
 	var latlng;
	var latitude;
	var longitude;
//한번 클릭
    kakao.maps.event.addListener(map, 'click', function(mouseEvent) {
    	searchDetailAddrFromCoords(mouseEvent.latLng, function(result, status) {
    		
        latlng = mouseEvent.latLng;  //위도 경도값
        // 마커를 클릭한 위치에 표시합니다 
		marker.setPosition(mouseEvent.latLng);
        marker.setImage(markerImage);
        marker.setMap(map);
        
        if (status === kakao.maps.services.Status.OK) {
        	 var detailAddr = !!result[0].road_address ? '<div>도로명주소 : ' + result[0].road_address.address_name + '</div>' : '';
             detailAddr += '<div>지번 주소: ' +'<span class="address">'+ result[0].address.address_name +'</span>'+ '</div>';
             
             //위도, 경도
             var a = String(latlng);
             latitude = String(a.substring(1,18));
             longitude = String(a.substring(20,38));
             
             var content = '<div class="bAddr">' +
                             '<span class="title">법정동 주소정보</span>' + 
                             detailAddr + latlng +   //주소, 위도, 경도값
                         '</div>';
  
   // 인포윈도우에 클릭한 위치에 대한 법정동 상세 주소정보를 표시합니다
      infowindow.setContent(content);
      infowindow.open(map, marker);
        }
        
 
        
    });
    });
   
    
    
// 마커가 지도 위에 표시되도록 설정합니다


new kakao.maps.Marker({
    position: new kakao.maps.LatLng(37.43699, 127.09598), 
    image: new kakao.maps.MarkerImage("./resources/image/category_icons_pin/meat_pin.png", imageSize, imageOption) // 마커이미지 설정 
}).setMap(map);  
new kakao.maps.Marker({
    position: new kakao.maps.LatLng(36.54699, 127.09598), 
    image: new kakao.maps.MarkerImage("./resources/image/category_icons_pin/ingredients_pin.png", imageSize, imageOption) // 마커이미지 설정 
}).setMap(map);  
new kakao.maps.Marker({
    position: new kakao.maps.LatLng(36.24699, 127.09598), 
    image: new kakao.maps.MarkerImage("./resources/image/category_icons_pin/seafood_pin.png", imageSize, imageOption) // 마커이미지 설정 
}).setMap(map);  


//중심 좌표나 확대 수준이 변경됐을 때 지도 중심 좌표에 대한 주소 정보를 표시하도록 이벤트를 등록합니다
kakao.maps.event.addListener(map, 'idle', function() {
    searchAddrFromCoords(map.getCenter(), displayCenterInfo);
});

function searchAddrFromCoords(coords, callback) {
    // 좌표로 행정동 주소 정보를 요청합니다
    geocoder.coord2RegionCode(coords.getLng(), coords.getLat(), callback);         
}

function searchDetailAddrFromCoords(coords, callback) {
    // 좌표로 법정동 상세 주소 정보를 요청합니다
    geocoder.coord2Address(coords.getLng(), coords.getLat(), callback);
}

// 지도 좌측상단에 지도 중심좌표에 대한 주소정보를 표출하는 함수입니다
function displayCenterInfo(result, status) {
    if (status === kakao.maps.services.Status.OK) {
        var infoDiv = document.getElementById('centerAddr');

        for(var i = 0; i < result.length; i++) {
            // 행정동의 region_type 값은 'H' 이므로
//             if (result[i].region_type === 'H') {
//                 infoDiv.innerHTML = result[i].address_name;
//                 break;
            }
        }
    }    

</script>
	
	 <div class="map_wrap">a
    <div id="map" style="width:100%;height:100%;position:relative;overflow:hidden; margin-left: 80px"></div>
    <div class="hAddr">
     </div><!--  end.hAddr -->
	</div><!--  end div.map_wrap -->
      <div id="map" style="width:100px;height:350px;"></div>     
	
	

</body>
</html>