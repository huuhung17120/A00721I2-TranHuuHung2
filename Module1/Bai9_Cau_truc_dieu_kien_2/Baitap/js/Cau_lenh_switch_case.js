function cal() {
    let month = document.getElementById("month").value;
    switch (month) {
        case "1":
        case "3":
        case "5":
        case "7":
        case "8":
        case "10":
        case "12":
            // Muốn truyền 1 biến vô trong chuỗi, thì mn dùng dấu `Chuỗi nè ${biến} chuỗi`
            document.getElementById("result").innerHTML = `Tháng ${month}  31 ngày`;
            break;
        case "4":
        case "6":
        case "9":
        case "11": {
            document.getElementById("result").innerHTML = `Tháng ${month} có 30 ngày`;
            break;
        }
        case "2":
            document.getElementById("result").innerHTML = `Tháng ${month} có 28 hoặc 29 ngày`;
            break;
        default: {
            alert("Vui lòng nhập tháng nhỏ hơn 12");
            break;
        }
    }
}
