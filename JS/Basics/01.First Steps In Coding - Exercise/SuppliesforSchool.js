function SuppliesforSchool (input){

    let pensCount = Number(input[0]);
    let markersCount = Number(input[1]);
    let abstergentLitres = Number(input[2]);
    let discount = Number(input[3]);

    let pensPrice = pensCount * 5.80;
    let markersPrice = markersCount * 7.20;
    let abstergentPrice = abstergentLitres * 1.20;
    
    let materialsPrice = pensPrice + markersPrice + abstergentPrice;
    let priceAfterDiscount = materialsPrice - (materialsPrice * (discount / 100));

    console.log(priceAfterDiscount);
}
SuppliesforSchool(["2 ","3 ","4 ","25 "]);