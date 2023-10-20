function reverseWordsInSentence(sentence) {
    const words = sentence.split(" ");
    const reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    const reversedSentence = reversedWords.join(" ");
    return reversedSentence;
}

const input = "This is a sunny day";
const reversed = reverseWordsInSentence(input);

console.log("Reversed Sentence: " + reversed);
