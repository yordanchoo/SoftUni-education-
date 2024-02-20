function bonusPoints (input){
    let number = Number(input[0]);
    let bonusPoints = 0.0;
    let additionalBonus = 0.0;

    if(number <= 100){
        bonusPoints += 5;
    } 
    else if(number > 100 && number <= 1000) {
        bonusPoints = number * 0.20;
    } 
    else if (number > 1000) {
        bonusPoints = number * 0.10;
    }

    if(number % 2 == 0){
        additionalBonus += 1;
    } 
    else if(number % 10 == 5){
        additionalBonus += 2;
    }

    let totalBonus = bonusPoints + additionalBonus;
    console.log(`${totalBonus}\n${number+totalBonus}`)
}
bonusPoints(["175"]);