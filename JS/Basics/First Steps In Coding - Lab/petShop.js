function petShop (input){
let dogsFoodCount = Number(input[0]);
let catsFoodCount = Number(input[1]);

let totalExpenses = ((dogsFoodCount * 2.50)+ (catsFoodCount * 4.00));

console.log(`${totalExpenses} lv.`);
}
petShop();