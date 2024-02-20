function passwordGuess(input){
    let passwordInput = input[0];
    let correctPassword = "s3cr3t!P@ssw0rd"; 
    
    if(passwordInput === correctPassword){
        console.log("Welcome");
    } else {
        console.log("Wrong password!");
    }
}
passwordGuess(["s3cr3t!P@ssw0rd"]);