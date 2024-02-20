function yardGreening(input){
    let squareMeters = Number(input[0]);

    let moneyNeeded = squareMeters * 7.61;
    let discount = moneyNeeded * 0.18;
    let finalPrice = moneyNeeded - discount;

    console.log(`The final price is: ${finalPrice} lv.`);
    console.log(`The discount is: ${discount} lv.`)
}
yardGreening();