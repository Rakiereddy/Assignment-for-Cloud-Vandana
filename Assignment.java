// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it

import java.util.*;
public class CollectionsShuffleExample1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5");
            System.out.println("List before Shuffle : "+list);
            Collections.shuffle(list);
            System.out.println("List after shuffle : "+list);
	      }
}




//Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "L"; // Replace with your Roman numeral

        int result = romanToInt(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }
}






//Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
from a-z) 

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = isPangram(input.toLowerCase());
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        for (char ch : input.toCharArray()) {
            alphabetSet.remove(ch);
        }

        return alphabetSet.isEmpty();
    }
}





//Take a sentence as an input and reverse every word in that sentence

function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");

    // Reverse each word
    let reversedWords = words.map(word => reverseString(word));

    // Join the reversed words to form the final sentence
    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

function reverseString(str) {
    // Convert the string to an array of characters, reverse it, and join back to a string
    return str.split("").reverse().join("");
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedResult = reverseWords(inputSentence);

console.log(reversedResult);




//Perform sorting of an array in descending order. 

let numbers = [5, 2, 8, 1, 7];

// Sorting in descending order
numbers.sort(function(a, b) {
    // Compare b to a to get descending order
    return b - a;
});

console.log(numbers); // Output: [8, 7, 5, 2, 1]





//Create a basic calculator using HTML, CSS, and JavaScript with the functionality of add, 
subtract, multiply and divide. Use the following picture for reference. 


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Basic Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        #calculator {
            width: 300px;
            border: 2px solid #ccc;
            padding: 10px;
            border-radius: 5px;
        }

        input {
            width: 100%;
            margin-bottom: 10px;
            padding: 10px;
            font-size: 18px;
        }

        button {
            width: 48px;
            height: 48px;
            font-size: 18px;
            margin: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<div id="calculator">
    <input type="text" id="display" disabled>
    <br>
    <button onclick="appendToDisplay('1')">1</button>
    <button onclick="appendToDisplay('2')">2</button>
    <button onclick="appendToDisplay('3')">3</button>
    <button onclick="operate('+')">+</button>
    <br>
    <button onclick="appendToDisplay('4')">4</button>
    <button onclick="appendToDisplay('5')">5</button>
    <button onclick="appendToDisplay('6')">6</button>
    <button onclick="operate('-')">-</button>
    <br>
    <button onclick="appendToDisplay('7')">7</button>
    <button onclick="appendToDisplay('8')">8</button>
    <button onclick="appendToDisplay('9')">9</button>
    <button onclick="operate('')"></button>
    <br>
    <button onclick="appendToDisplay('0')">0</button>
    <button onclick="clearDisplay()">C</button>
    <button onclick="calculate()">=</button>
    <button onclick="operate('/')">/</button>
</div>

<script>
    function appendToDisplay(value) {
        document.getElementById('display').value += value;
    }

    function clearDisplay() {
        document.getElementById('display').value = '';
    }

    function operate(operator) {
        appendToDisplay(operator);
    }

    function calculate() {
        try {
            const result = eval(document.getElementById('display').value);
            document.getElementById('display').value = result;
        } catch (error) {
            document.getElementById('display').value = 'Error';
        }
    }
</script>

</body>
</html>








//Create a survey form with Fields; First Name, Last Name, Date of Birth, Country (dropdown), 
Gender (checkbox), Profession, email, and mobile number. All the input fields are 
necessary to submit the form. Create two buttons Submit and Reset. Reset will reset the 
form while clicking on submit, first, it will check all the fields and necessary validations and 
then a popup will appear displaying all the selected values with the label in front of it. On 
closing the popup, the form should reset all the values. Use the following for reference


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Survey Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        form {
            width: 400px;
            padding: 20px;
            border: 2px solid #ccc;
            border-radius: 5px;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
        }

        input[type="checkbox"] {
            width: auto;
            margin-right: 5px;
        }

        button {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<form id="surveyForm">
    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" required>

    <label for="lastName">Last Name:</label>
    <input type="text" id="lastName" required>

    <label for="dob">Date of Birth:</label>
    <input type="date" id="dob" required>

    <label for="country">Country:</label>
    <select id="country" required>
        <option value="">Select Country</option>
        <option value="usa">USA</option>
        <option value="canada">Canada</option>
        <!-- Add more countries as needed -->
    </select>

    <label>Gender:</label>
    <input type="checkbox" id="male" name="gender" value="male">
    <label for="male">Male</label>
    <input type="checkbox" id="female" name="gender" value="female">
    <label for="female">Female</label>

    <label for="profession">Profession:</label>
    <input type="text" id="profession" required>

    <label for="email">Email:</label>
    <input type="email" id="email" required>

    <label for="mobile">Mobile Number:</label>
    <input type="tel" id="mobile" pattern="[0-9]{10}" required>

    <button type="button" onclick="submitForm()">Submit</button>
    <button type="button" onclick="resetForm()">Reset</button>
</form>

<script>
    function submitForm() {
        // Get form values
        const firstName = document.getElementById('firstName').value;
        const lastName = document.getElementById('lastName').value;
        const dob = document.getElementById('dob').value;
        const country = document.getElementById('country').value;
        const gender = Array.from(document.getElementsByName('gender'))
            .filter(checkbox => checkbox.checked)
            .map(checkbox => checkbox.value);
        const profession = document.getElementById('profession').value;
        const email = document.getElementById('email').value;
        const mobile = document.getElementById('mobile').value;

        // Validate form fields
        if (!firstName || !lastName || !dob || !country || gender.length === 0 || !profession || !email || !mobile) {
            alert('All fields are required. Please fill in all the fields.');
            return;
        }

        // Display popup with selected values
        const message = `First Name: ${firstName}\nLast Name: ${lastName}\nDate of Birth: ${dob}\nCountry: ${country}\nGender: ${gender.join(', ')}\nProfession: ${profession}\nEmail: ${email}\nMobile: ${mobile}`;

        alert(message);

        // Reset the form
        resetForm();
    }

    function resetForm() {
        document.getElementById('surveyForm').reset();
    }
</script>

</body>
</html>
