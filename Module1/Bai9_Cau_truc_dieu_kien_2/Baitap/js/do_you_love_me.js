function yesClick() {
    alert("Yes, you are right");
}
function init() {
    let noObj = document.getElementById('btn-no');
    noObj.style.position = 'relative';
    noObj.style.left = '0px';
    noObj.style.top = '0px';
}
function noHover() {
    let x = Math.floor(Math.random() * window.innerWidth);
    let y = Math.floor(Math.random() * window.innerHeight);
    document.getElementById("btn-no").style.left = x + "px";
    document.getElementById("btn-no").style.top = y+ "px";
}

window.onload =init;
