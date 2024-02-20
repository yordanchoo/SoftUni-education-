function repainting(input) {
    
    let nylonQuantity = Number(input[0]);
    let paintQuantity = Number(input[1]);
    let diluentQUantity = Number(input[2]);
    let workersHours = Number(input[3]);

    let nylonToBuy = (nylonQuantity + 2) * 1.50;
    let paintToBuy = (paintQuantity + (paintQuantity * 0.10))*14.5;
    let diluentToBuy = diluentQUantity * 5.00;
    
    let sumMaterials = nylonToBuy + paintToBuy + diluentToBuy + 0.40;
    let moneyForWorkers = (sumMaterials * 0.30) * workersHours; 
    let finalTotal = sumMaterials + moneyForWorkers;

    console.log(finalTotal);
}
repainting(["10 ",
"11 ",
"4 ",
"8 "]
);