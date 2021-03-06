#pragma config(Sensor, S3,     colorSensor,    sensorColorNxtFULL)
//*!!Code automatically generated by 'ROBOTC' configuration wizard               !!*//

task main()
{
  eraseDisplay();
  displayCenteredTextLine(1, "Detected color:");

  // Loop forever
  while (true)
  {
    // Check the detected colour and display the name of the
    // color in a large font on the screen.
    switch(SensorValue[colorSensor])
    {
      case BLACKCOLOR:  displayCenteredBigTextLine(4, "Black");   break;
      case BLUECOLOR:   displayCenteredBigTextLine(4, "Blue");    break;
      case GREENCOLOR:  displayCenteredBigTextLine(4, "Green");   break;
      case YELLOWCOLOR: displayCenteredBigTextLine(4, "Yellow");  break;
      case REDCOLOR:    displayCenteredBigTextLine(4, "Red");     break;
      case WHITECOLOR:  displayCenteredBigTextLine(4, "White");   break;
      default:          displayCenteredBigTextLine(4, "Unknown"); break;
    }
    // Wait 20 ms, this gives us 50 readings per second
    sleep(20);
  }
}
