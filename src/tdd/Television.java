package tdd;

public class Television {

 private int channel = 1;
 private int contrast = 5;

 public boolean tvIsOn() {
 return true;
 }

 public boolean tvIsOff() {
 return false;
 }

 public int checkChannel() {
 return channel;
 }

 public void toNextChannel() {
 channel = channel + 1;
 }

 public void toPreviousChannel() {
  channel = channel - 1;
 }

 public void goToSpecifiedChannel(int channelNumber) {
  if(channelNumber <= 100 ){channel = channelNumber;}
  else {channel = channelNumber - 100;}
 }

 public int checkContrastLevel() {
  return contrast;
 }

 public void increaseContrast() {
  if(contrast < 10 ) {contrast = contrast + 1;}
 }

 public void decreaseContrast() {
   if(contrast > 1){contrast = contrast - 1;}
 }
}