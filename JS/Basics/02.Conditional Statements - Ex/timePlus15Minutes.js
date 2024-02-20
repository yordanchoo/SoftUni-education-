function timePlus15Minutes (input){
    let hourInput = Number(input[0]);
    let minutesInput = Number(input[1]);

    let totalTimeInMinutes= (hourInput * 60) + minutesInput;
    let afterAddedMins  = totalTimeInMinutes + 15;

    let hour = parseInt(afterAddedMins/ 60);
    let minutes = afterAddedMins % 60;

    if(hour >= 24){
        hour -= 24;
    }

    if(minutes > 59){
        minutes -= 59;
        hour += 1;
    }

    if(minutes < 10){
        console.log(`${hour}:0${minutes}`)
    } 
    else {
        console.log(`${hour}:${minutes}`)
    }
}
timePlus15Minutes(["0","01"]);