import 'dart:io';
void main(List<String> args) {
  stdout.write("Tienes la luza  apagada");
  String luz=stdin.readLineSync() ?? "No ha detectado nada";

  if(luz=="Y"){
    stdout.write("la luz esta encendida");
  }else if(luz=="N"){
    stdout.write("la luz esta apagada");
  }else{
    print("No has pulsado ninguna de las dos");
  }
}