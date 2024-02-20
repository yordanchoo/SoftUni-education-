function basketballEquipment(input){

    let yearSubscription = Number(input[0]);

    let sneakersPrice = yearSubscription - ( yearSubscription * 0.40);
    let jerseyPrice = sneakersPrice - ( sneakersPrice * 0.20);
    let ballPrice = jerseyPrice * 0.25;
    let accesorriesPrice = ballPrice * 0.2;

    let totalEquipmentPrice = yearSubscription + sneakersPrice + jerseyPrice + ballPrice + accesorriesPrice;

    console.log(totalEquipmentPrice);

}
basketballEquipment(['365']);