function shopping(input){

let budget = Number(input[0]);
let videoCardsCount = Number(input[1]);
let cpuCount = Number(input[2]);
let ramCount = Number(input[3]); 

let videoCardPrice = videoCardsCount * 250;
let cpuPrice = (videoCardPrice * 0.35) * cpuCount;
let ramPrice = (videoCardPrice * 0.10) * ramCount;

let partsPrice = videoCardPrice + cpuPrice + ramPrice;

if(videoCardsCount > cpuCount){
    let discount = partsPrice * 0.15;
    partsPrice = partsPrice - discount;
}

if(partsPrice < budget){
    let difference = budget - partsPrice;
    console.log(`You have ${difference.toFixed(2)} leva left!`);
} 
else { 
    let difference = partsPrice - budget;
    console.log(`Not enough money! You need ${difference.toFixed(2)} leva more!`);
}
}
// shopping(["900","2","1","3"]);
// shopping(["920.45",
// "3",
// "1",
// "1"]);

