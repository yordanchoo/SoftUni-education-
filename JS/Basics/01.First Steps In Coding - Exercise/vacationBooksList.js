function vacationBooksList (input){

    let pagesInBook = Number(input[0]);
    let pagesPerHour = Number(input[1]);
    let daysToReadBook = Number(input[2]);

    let totalReadingTime = pagesInBook / pagesPerHour;
    let hoursToReadPerDay = totalReadingTime / daysToReadBook;

    console.log(hoursToReadPerDay);
}
vacationBooksList(["212 ","20 ","2 "]);