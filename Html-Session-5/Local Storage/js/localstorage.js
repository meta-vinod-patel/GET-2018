function clickCounterInterior() {
    if(typeof(Storage) !== "undefined") {
        if (localStorage.clickcount) {
            localStorage.clickcount = Number(localStorage.clickcount)+1;
        } else {
            localStorage.clickcount = 1;
        }
        document.getElementById("resultForInternalVariable").innerHTML = "You have clicked the button " + localStorage.clickcount + " time(s).";
    } else {
        document.getElementById("resultForInternalVariable").innerHTML = "Sorry, your browser does not support web storage...";
    }
}

function clickCounterExterior() {
    if(typeof(Storage) !== "undefined") {
       if (localStorage.getItem("counter") === null) {
			localStorage.setItem("counter", 1);
		}
		else {
			localStorage.setItem("counter", parseInt(localStorage.getItem("counter"))+1);
		}
		document.getElementById("resultForExteriorVariable").innerHTML = "You have clicked the button " + localStorage.getItem("counter") + " time(s).";
    } else {
        document.getElementById("resultForExteriorVariable").innerHTML = "Sorry, your browser does not support web storage...";
    }
}

function clickCounterDeleteInterior() {
    if(typeof(Storage) !== "undefined") {
        if (localStorage.clickcount) {
            localStorage.clickcount = 0;
			document.getElementById("resultForInternalVariableDelete").innerHTML = "You have reset internal variable from local storage";
        } else {
            document.getElementById("resultForInternalVariableDelete").innerHTML = "YInbuilt variable already zero";
        }
    } else {
        document.getElementById("resultForInternalVariableDelete").innerHTML = "Sorry, your browser does not support web storage...";
    }
}

function clickCounterDeleteExterior() {
    if(typeof(Storage) !== "undefined") {
        if (localStorage.getItem("counter") == "undefined") {
            document.getElementById("resultForExteriorVariableDelete").innerHTML = "No external variable is present";
        } else {
            localStorage.removeItem("counter");
			document.getElementById("resultForExteriorVariableDelete").innerHTML = "You have deleted external variable from local storage";
        }
        
    } else {
        document.getElementById("resultForExteriorVariableDelete").innerHTML = "Sorry, your browser does not support web storage...";
    }
}