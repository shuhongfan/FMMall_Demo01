function getUrlParam(key){
	var url = decodeURI( window.location.toString() );
	var arr = url.split("?");
	if(arr.length>1){
		var params = arr[1].split("&");
		for(var i=0; i<params.length; i++){
			var param = params[i];  //"pid=101"
			if(param.split("=")[0] == key ){
				return param.split("=")[1];
			}
		}
	}
	return null;
}