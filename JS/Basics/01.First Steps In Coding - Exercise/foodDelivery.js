function foodDelivery(input){

    let chickenCount = Number(input[0]);
    let fishCount = Number(input[1]);
    let vegeterianCount = Number(input[2]);

    let chickenMenuPrice = chickenCount * 10.35;
    let fishMenuPrice = fishCount * 12.40;
    let veggiePrice = vegeterianCount * 8.15;
    let foodSum = chickenMenuPrice + fishMenuPrice + veggiePrice;
    let desertsPrice = foodSum * 0.20;

    let totalOrderPrice = foodSum + desertsPrice + 2.50;

    console.log(totalOrderPrice);

}
foodDelivery(["2 ",
"4 ",
"3 "]
);