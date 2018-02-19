
    var c = document.getElementById("canvas1");
    var ctx = c.getContext("2d");
    ctx.beginPath();
    ctx.arc(100, 75, 55, 0, 2 * Math.PI);
    ctx.fillStyle = '#28C3D5';
    ctx.fill();

    c = document.getElementById("canvas2");
ctx = c.getContext("2d");
ctx.beginPath();
ctx.arc(100, 75, 50, 0, 2 * Math.PI);
ctx.lineWidth = 10;
ctx.strokeStyle = '#800000';
ctx.stroke();

c = document.getElementById("canvas3");
ctx = c.getContext("2d");
ctx.beginPath();
ctx.arc(100, 75, 50, 0, 2 * Math.PI);
ctx.lineWidth = 10;
ctx.strokeStyle = '#DCDCDC';
ctx.stroke();
ctx.beginPath();
ctx.arc(100, 75, 55, Math.PI/2, 3/2 * Math.PI);
ctx.fillStyle = '#28C3D5';
ctx.fill();

c = document.getElementById("canvas4");
ctx = c.getContext("2d");
ctx.beginPath();
ctx.rect(45, 20, 110, 110);
ctx.fillStyle = '#228B22';
ctx.fill();

c = document.getElementById("canvas5");
ctx = c.getContext("2d");
ctx.beginPath();
ctx.moveTo(100, 20);
ctx.lineTo(30, 130);
ctx.lineTo(170, 130);
ctx.closePath();
ctx.fillStyle = '#800000';
ctx.fill();

c = document.getElementById("canvas6");
ctx = c.getContext("2d");
ctx.beginPath();
ctx.arc(100, 75, 50, 0, 2 * Math.PI);
ctx.lineWidth = 10;
ctx.strokeStyle = '#FF8C00';
ctx.stroke();
ctx.fillStyle = '#CCCC00'; 
ctx.fill();
ctx.beginPath();
ctx.rect(90, 40, 20, 70);
ctx.fillStyle = '#FFFFFF';
ctx.fill();
ctx.beginPath();
ctx.rect(65, 65, 70, 20);
ctx.fillStyle = '#FFFFFF';
ctx.fill();

