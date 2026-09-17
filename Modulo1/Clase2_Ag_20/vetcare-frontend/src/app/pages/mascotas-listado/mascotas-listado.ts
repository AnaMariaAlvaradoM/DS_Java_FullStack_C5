import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { MascotaCard } from '../../components/mascota-card/mascota-card';

@Component({
  selector: 'app-mascotas-listado',
  imports: [RouterLink, MascotaCard],
  templateUrl: './mascotas-listado.html',
  styleUrl: './mascotas-listado.css'
})
export class MascotasListado {
  mascotas = [
  // --- Datos originales, deduplicados ---
  { id: 1, nombre: 'Firulais', especie: 'Perro', edad: 4, foto: 'https://placedog.net/400/300?id=1' },
  { id: 2, nombre: 'Michi',    especie: 'Gato',  edad: 2, foto: 'https://loremflickr.com/400/300/cat?lock=2' },
  { id: 3, nombre: 'Rocky',    especie: 'Perro', edad: 6, foto: 'https://placedog.net/400/300?id=7' },

  // --- 25 nuevos ---
  { id: 4,  nombre: 'Luna',     especie: 'Gato',    edad: 3,  foto: 'https://loremflickr.com/400/300/cat?lock=4' },
  { id: 5,  nombre: 'Toby',     especie: 'Perro',   edad: 5,  foto: 'https://placedog.net/400/300?id=12' },
  { id: 6,  nombre: 'Nala',     especie: 'Gato',    edad: 1,  foto: 'https://loremflickr.com/400/300/cat?lock=6' },
  { id: 7,  nombre: 'Max',      especie: 'Perro',   edad: 7,  foto: 'https://placedog.net/400/300?id=18' },
  { id: 8,  nombre: 'Kiwi',     especie: 'Ave',     edad: 2,  foto: 'https://loremflickr.com/400/300/parrot?lock=8' },
  { id: 9,  nombre: 'Copito',   especie: 'Conejo',  edad: 1,  foto: 'https://loremflickr.com/400/300/rabbit?lock=9' },
  { id: 10, nombre: 'Bruno',    especie: 'Perro',   edad: 3,  foto: 'https://placedog.net/400/300?id=25' },
  { id: 11, nombre: 'Salem',    especie: 'Gato',    edad: 4,  foto: 'https://loremflickr.com/400/300/cat?lock=11' },
  { id: 12, nombre: 'Tango',    especie: 'Tortuga', edad: 5,  foto: 'https://loremflickr.com/400/300/turtle?lock=12' },
  { id: 13, nombre: 'Duna',     especie: 'Perro',   edad: 2,  foto: 'https://placedog.net/400/300?id=33' },
  { id: 14, nombre: 'Simba',    especie: 'Gato',    edad: 6,  foto: 'https://loremflickr.com/400/300/cat?lock=14' },
  { id: 15, nombre: 'Coco',     especie: 'Ave',     edad: 1,  foto: 'https://loremflickr.com/400/300/parrot?lock=15' },
  { id: 16, nombre: 'Bella',    especie: 'Perro',   edad: 4,  foto: 'https://placedog.net/400/300?id=41' },
  { id: 17, nombre: 'Whiskers', especie: 'Gato',    edad: 3,  foto: 'https://loremflickr.com/400/300/cat?lock=17' },
  { id: 18, nombre: 'Peque',    especie: 'Hamster', edad: 1,  foto: 'https://loremflickr.com/400/300/hamster?lock=18' },
  { id: 19, nombre: 'Zeus',     especie: 'Perro',   edad: 8,  foto: 'https://placedog.net/400/300?id=50' },
  { id: 20, nombre: 'Mia',      especie: 'Gato',    edad: 2,  foto: 'https://loremflickr.com/400/300/cat?lock=20' },
  { id: 21, nombre: 'Manchas',  especie: 'Conejo',  edad: 2,  foto: 'https://loremflickr.com/400/300/rabbit?lock=21' },
  { id: 22, nombre: 'Rex',      especie: 'Perro',   edad: 5,  foto: 'https://placedog.net/400/300?id=57' },
  { id: 23, nombre: 'Nube',     especie: 'Gato',    edad: 1,  foto: 'https://loremflickr.com/400/300/cat?lock=23' },
  { id: 24, nombre: 'Pico',     especie: 'Ave',     edad: 3,  foto: 'https://loremflickr.com/400/300/parrot?lock=24' },
  { id: 25, nombre: 'Trufa',    especie: 'Perro',   edad: 6,  foto: 'https://placedog.net/400/300?id=64' },
  { id: 26, nombre: 'Garfield', especie: 'Gato',    edad: 7,  foto: 'https://loremflickr.com/400/300/cat?lock=26' },
  { id: 27, nombre: 'Speedy',   especie: 'Tortuga', edad: 2,  foto: 'https://loremflickr.com/400/300/turtle?lock=27' },
  { id: 28, nombre: 'Canela',   especie: 'Perro',   edad: 3,  foto: 'https://placedog.net/400/300?id=71' },

  ];
}