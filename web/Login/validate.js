function validate(theForm){
	if(theForm.user.value.length==0){
		alert("UserId can't be blank");
		theForm.user.focus();
		return false;
	}else if(theForm.pass.value.length==0){
		alert("Password can't be blank");
		theForm.pass.focus();
		return false;
	}else if(theForm.pass.value.length<6){
		alert("Password length can't be less than 6 char");
		theForm.pass.focus();
		return false;
	}
}


