function depositCalculator(input){

    let depositAmount = Number(input[0]);
    let timeOfDeposit = Number(input[1]);
    let inerestRate = Number(input[2]);

    let interestRateTotal = depositAmount * (inerestRate/100);
    let interestRatePerMonth = interestRateTotal / 12;
    let finalSum = depositAmount + timeOfDeposit * interestRatePerMonth;

    console.log(finalSum);
}
depositCalculator(["2350","6 ", "7"]);