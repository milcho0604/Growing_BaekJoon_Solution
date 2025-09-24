function solution(number) {
    let answer = 0;
    for(let i=0; i<number.length; i++){
        let temp = parseInt(number.charAt(i));
        answer += temp;
    }
    answer = answer%9;
    return answer;
}