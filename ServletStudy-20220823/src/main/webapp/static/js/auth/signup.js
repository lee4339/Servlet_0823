const submitButton = document.querySelector(".submitBtn");
const inputId = document.querySelector(".input-id");
const inputPw = document.querySelector(".input-password");
const inputName = document.querySelector(".input-name");
const inputEmail = document.querySelector(".input-email");


submitButton.onclick = () => {
	$.ajax({
		async: false,		
		type: "post",					
		url: "/api/v1/auth/signup",
		data: {
			"userId" : inputId.value,
			"userPassword" : inputPw.value,
			"userName" : inputName.value,
			"userEmail" : inputEmail.value
		},
		dataType: "json",
		success: (response) => {		
			alert("회원가입 성공.");
			console.log(response);
			document.querySelector("body").innerHTML = `
				<h1>${response.userId}<h1>	
				<h1>${response.userPassword}<h1>	
				<h1>${response.userName}<h1>	
				<h1>${response.userEmail}<h1>	
			`
		},
		error: (error) => {				
			console.log(error);
		}
		 
	})
};
