function  testJS(id){
	alert(id);
}

function hidepopup(canvas){
	PF(canvas).hide();
}

function showpopup(canvas){
    PF(canvas).positionInitialized = false;
    PF(canvas).loaded = false;
	PF(canvas).show();
}