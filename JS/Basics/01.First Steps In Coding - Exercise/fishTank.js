function fishTank (input) {

    let length = Number(input[0]);
    let width = Number(input[1]);
    let heigth = Number(input[2]);
    let percentege = Number(input[3]);

    let tankVolume = length * width * heigth;
    let volumeInLiters = tankVolume * 0.001;
    let percentageCount = percentege / 100;
    let litersNeeded = volumeInLiters * ( 1 - percentageCount);

    console.log(litersNeeded);
}