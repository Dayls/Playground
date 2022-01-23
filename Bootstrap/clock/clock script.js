const hour_hand = document.getElementById('clock-hour-hand')
const minute_hand = document.getElementById('clock-minute-hand')
const second_hand = document.getElementById('clock-second-hand')

const date = new Date()
function enable_clock() {
    var rect = second_hand.getBoundingClientRect()

    setTimeout("enable_clock()", 1000);
}

