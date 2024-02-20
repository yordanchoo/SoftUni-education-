function projectsCreation(input) {
    let architectName = input[0];
    let projectsCount = Number(input[1]);
    let hoursNeeded = projectsCount * 3;

    console.log(`The architect ${architectName} will need ${hoursNeeded} hours to complete ${projectsCount} project/s.`)
}
projectsCreation();