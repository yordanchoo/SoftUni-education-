function areaOfFigures(input){
    let area = 0.0;

    if(input[0] === "square"){
        let a = Number(input[1]);
        area = a*a;
    } 
    else if(input[0] === "rectangle"){
        let sideA = Number(input[1]);
        let sideB = Number(input[2]);
        area = sideA * sideB;
    }
    else if(input[0] === "circle"){
        let radius = Number(input[1]);
        area = Math.PI * Math.pow(radius,2);
    }
    else if(input[0] === "triangle"){
        let base = Number(input[1]);
        let height = Number(input[2]);
        area = 0.5 * base * height;
    }
    console.log(area.toFixed(3));
}
areaOfFigures(["circle","6"]);