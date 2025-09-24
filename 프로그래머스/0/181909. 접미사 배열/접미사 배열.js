function solution(my_string) {
    const len = my_string.length;
    console.log(len);
    let answer = [];
    for(let i=0; i<len; i++){
        answer.push(my_string.substring(i));
    }
    answer.sort();
    return answer;
}