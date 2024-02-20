function toyShop (input) {

    let tripPrice = Number(input[0]);
    let puzzlesCount = Number(input[1]);
    let dollsCount = Number(input[2]);
    let bearsCount = Number(input[3]);
    let minionsCount = Number(input[4]);
    let trucksCount = Number(input[5]);


    let puzzlrPrice = puzzlesCount * 2.60;
    let dollsPrice = dollsCount * 3.00;
     let bearsPrice = bearsCount * 4.10;
     let minionsPrice = minionsCount * 8.20;
     let trucksPrice = trucksCount * 2.00;

     let toysCount = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount;
     let toysPrice = puzzlrPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

     if(toysCount >= 50){
        let discount = toysPrice * 0.25;
        toysPrice = toysPrice - discount; 
     }

     let rent = toysPrice * 0.10;
     let totalAfterRent = toysPrice - rent;

     if(totalAfterRent >= tripPrice){
        console.log(`Yes! ${(totalAfterRent-tripPrice).toFixed(2)} lv left.`)
     } 
     else {
        console.log(`Not enough money! ${(tripPrice-totalAfterRent).toFixed(2)} lv needed.`)
     } 

}
toyShop(["320",
"8",
"2",
"5",
"5",
"1"]);
