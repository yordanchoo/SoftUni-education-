function godzillaVsKong (input) {

let movieBudget = Number(input[0]);
let statistsCount = Number(input[1]);
let oufitPrice = Number(input[2]);

let priceAfterDecor = movieBudget * 0.10;
let statistsOutfitPrice = statistsCount * oufitPrice;

if(statistsCount > 150){
    let afterDiscount = statistsOutfitPrice * 0.10;
    let statistsOutfitPrice = statistsOutfitPrice - afterDiscount;
}

let totalPrice = priceAfterDecor + statistsOutfitPrice;

if(totalPrice > movieBudget){
    console.log(`Not enough money!\nWingard needs ${(totalPrice - movieBudget).toFixed(2)} leva more.`);
}
else {
    console.log(`Action!\nWingard starts filming with ${(movieBudget-totalPrice).toFixed(2)} leva left.`)
}

}
godzillaVsKong(["20000",
"120",
"55.5"]
);