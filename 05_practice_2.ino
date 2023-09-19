#define PIN_LED 7
unsigned int count, toggle;

void setup() {
  pinMode(PIN_LED, OUTPUT);
  count = 0;
  toggle = 0;
  digitalWrite(PIN_LED, toggle); 
}

void loop() {
  delay(1000);

  while (count < 13) {
    count = count + 1 ;
    toggle = toggle_state(toggle);
    digitalWrite(PIN_LED, toggle);
    delay(100);
  }
}

int toggle_state(int toggle) {
  if (toggle == HIGH) {
    return LOW;
  } else {
    return HIGH;
  }
}
