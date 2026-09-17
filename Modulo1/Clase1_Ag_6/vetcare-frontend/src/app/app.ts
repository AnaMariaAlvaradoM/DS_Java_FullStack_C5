import { Component } from '@angular/core';
import { MascotaCard } from './components/mascota-card/mascota-card';

@Component({
  selector: 'app-root',
  imports: [MascotaCard],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  nombreClinica = 'VetCare';
  mascotas = [
    { nombre: 'Firulais', especie: 'Perro', edad: 4 },
    { nombre: 'Michi', especie: 'Gato', edad: 2 },
    { nombre: 'Rocky', especie: 'Perro', edad: 6 }
  ];
}