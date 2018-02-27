// on load hide field od showcity
function init() {
	document.getElementById('selectCity').style.display='none';	
}

// to change screen on anchor
function changeScreen(target) {
	    window.location.href = target+'.html';
}

$(document).ready(function(){
    $('#mylist a').click(function(){
        switch ($('#mylist a').index(this)) {
			case 0: window.location.href = 'index.html';
					break;
			case 1:	alert("No page yet");
				    break;
			case 2:	alert("No page yet");
					break;
			case 3:	alert("No page yet");
					break;
			case 4: window.location.href = 'contact.html';
					break;			
		}
    });
});

/* to validate name
   min char -> 5
   max char -> 20   
*/
function validateName(nameField) {
    var regex = /^[a-zA-Z ]{5,20}$/;
    if (!regex.test(nameField.value)) {
        nameField.style.borderColor="red";
        return false;
    }
    nameField.style.borderColor="#DCDCDC";
	return true;
}

// to validate email
function validateEmail(emailField) {
	var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
	if (!reg.test(emailField.value)) {
	   emailField.style.borderColor="red";
	   return false;
	}
	emailField.style.borderColor="#DCDCDC";
	return true;
}

// to show city on change from drop down list
function showCity(selectedCity) {
   var x = document.getElementById('selectCity');
   x.value = "Selected City: " + selectedCity;
   x.style.display='initial';
} 

/* to validate organizationField
   min char -> 3
*/
function validateOrganization(organizationField) {
	var regex = /^[a-zA-Z ]{3,}$/;
    if (!regex.test(organizationField.value)) {
        organizationField.style.borderColor="red";
        return false;
    }
	organizationField.style.borderColor="#DCDCDC";
	return true;
}

// to validate Phone/Mobile Number
function validatePhoneNumber(phoneField) {
    var regex = /^(\91-|\91|0)?\d{10}$/;
    if (!regex.test(phoneField.value)) {
        phoneField.style.borderColor="red";
        return false;
    }
	phoneField.style.borderColor="#DCDCDC";
	return true;
}

// to validate message
function validateMessage(messageField) {
    if (messageField.value.length < 5) {
		messageField.style.borderColor="red";
        return false;
    }
	else if (messageField.value.length > 250) {
		messageField.value = messageField.value.substring(0,251);
	}
    messageField.style.borderColor="#DCDCDC";
	return true;
}