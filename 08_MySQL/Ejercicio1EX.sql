/*1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.*/
select Nombre from jugadores
order by Nombre;
/*2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.*/
select Nombre from jugadores
where Posicion = 'C'
and Peso > 200
order by Nombre;
/*3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.*/
select Nombre from equipos
order by Nombre;
/*4. Mostrar el nombre de los equipos del este (East).*/
select Nombre from equipos
where Conferencia = 'East';
/*5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.*/
select * from equipos
where Ciudad like 'c%'
order by Nombre;
/*6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.*/
select * from jugadores
order by Nombre_equipo;
/*7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.*/
select * from jugadores
where Nombre_equipo = 'Raptors'
order by Nombre;
/*8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.*/
select j.Nombre, e.Puntos_por_partido from estadisticas e, jugadores j
where j.codigo = e.jugador
and j.Nombre = 'Pau Gasol';
/*9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.*/
select e.temporada, j.Nombre, e.Puntos_por_partido from estadisticas e, jugadores j
where j.codigo = e.jugador
and j.Nombre = 'Pau Gasol'
and e.temporada = '04/05';
/*10. Mostrar el número de puntos de cada jugador en toda su carrera.*/
select j.Nombre, round(sum(e.Puntos_por_partido)) as Puntos_Totales from jugadores j, estadisticas e
where j.codigo = e.jugador
group by j.Nombre
order by j.Nombre;
/*11. Mostrar el número de jugadores de cada equipo.*/
select count(Nombre), Nombre_equipo from jugadores
group by Nombre_equipo;
/*12. Mostrar el jugador que más puntos ha realizado en toda su carrera*/
select j.Nombre, round(sum(e.Puntos_por_partido)) as Puntos_Totales from jugadores j, estadisticas e
where j.codigo = e.jugador
group by j.Nombre
order by Puntos_Totales desc
limit 1;
/*13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.*/
select e.Nombre, e.Conferencia, e.Division, j.Nombre as Jugador from equipos e, jugadores j
where e.Nombre = j.Nombre_equipo
and j.Altura = (select max(Altura)from jugadores);
/*14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.*/
select equipo_local, equipo_visitante,(puntos_local-puntos_visitante) as diferencia from partidos
order by diferencia desc
limit 1;
/*15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null. */
select codigo, equipo_local, equipo_visitante, ((select equipo_local from partidos where puntos_local > puntos_visitante)) 
as equipo_ganador 
from partidos;
