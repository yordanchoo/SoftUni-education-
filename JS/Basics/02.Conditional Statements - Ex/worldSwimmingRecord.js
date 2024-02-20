function worldSwimmingRecord (input) {
    let recordInSeconds = parseFloat(input[0]);
    let distanceInMeters = parseFloat(input[1]);
    let secondPerMeter = parseFloat(input[2]);

    let timeInSeconds = distanceInMeters * secondPerMeter;
    let resistanceTime = Math.floor(distanceInMeters / 15) * 12.5;
    let finalTime = resistanceTime + timeInSeconds;

    if(finalTime >= recordInSeconds){
        let difference = finalTime - recordInSeconds;
        console.log(`No, he failed! He was ${difference.toFixed(2)} seconds slower.`);
    } 
    else {
        console.log(`Yes, he succeeded! The new world record is ${finalTime.toFixed(2)} seconds.`)
    }
}
 //worldSwimmingRecord(["10464","1500","20"]);
//worldSwimmingRecord(["55555.67","3017","5.03"]);
