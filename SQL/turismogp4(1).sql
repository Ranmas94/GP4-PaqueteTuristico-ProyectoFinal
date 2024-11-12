-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2024 a las 23:42:49
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `turismogp4`
--
CREATE DATABASE IF NOT EXISTS `turismogp4` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `turismogp4`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamiento`
--

CREATE TABLE `alojamiento` (
  `idAlojamiento` int(11) NOT NULL,
  `idDestino` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `nroAmbientes` int(11) DEFAULT NULL,
  `cama` int(11) DEFAULT NULL,
  `banios` int(11) DEFAULT NULL,
  `precioPorNoche` decimal(10,2) DEFAULT NULL,
  `vigente` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alojamiento`
--

INSERT INTO `alojamiento` (`idAlojamiento`, `idDestino`, `nombre`, `direccion`, `capacidad`, `nroAmbientes`, `cama`, `banios`, `precioPorNoche`, `vigente`) VALUES
(1, 1, 'Hotel Carsson', 'Maipú y Viamonte 543', 5, 4, 4, 2, 10100.00, 1),
(2, 1, 'Hostal Circus', 'Carlos Calvo y Chacabuco 212', 5, 4, 2, 3, 22000.00, 1),
(3, 1, 'Hotel Gran King', 'Lavalle y Florida 8891', 2, 1, 1, 1, 12000.00, 1),
(4, 2, 'La Boca B&B.Posada', 'Falucho 999', 3, 3, 3, 2, 8000.00, 1),
(5, 2, 'Hostal Ledezma', 'Caseros y Vicente 100', 4, 2, 3, 2, 10500.00, 1),
(6, 2, 'Hostal Babel', '25 de Mayo y Avellaneda 1211', 2, 1, 2, 1, 11900.00, 1),
(7, 2, 'Hotel Juan Manuel de Rosas', 'San Martin 1321', 4, 4, 4, 2, 20000.00, 1),
(8, 2, 'Hotel Playa Dorada', 'Avenida del Mar 456', 4, 3, 4, 3, 15000.00, 1),
(9, 3, 'Hotel Jardín Secreto', 'Calle de los Olivos 789', 5, 4, 3, 3, 18000.00, 1),
(10, 3, 'Hostal Vista al Lago', 'Ruta 25 Km 10', 2, 1, 1, 1, 22000.00, 1),
(11, 3, 'Hotel Sol y Luna', 'Avenida Central 123', 1, 1, 1, 1, 25000.00, 1),
(12, 3, 'Posada Paraíso Tropical', 'Calle del Sol 456', 4, 3, 3, 2, 30000.00, 1),
(13, 3, 'Posada Cielo Azul', 'Calle de la Libertad 12', 4, 3, 3, 1, 17000.00, 1),
(14, 4, 'Hotel Oasis Verde', 'Avenida de la Naturaleza 45', 3, 2, 2, 1, 19000.00, 1),
(15, 4, 'Hotel Estrella del Mar', 'Calle del Mar 23', 6, 5, 5, 3, 23000.00, 1),
(16, 4, 'Hotel Montaña Dorada', 'Camino de las Montañas 88', 5, 4, 4, 2, 21000.00, 1),
(17, 4, 'Hotel Rincón del Viento', 'Paseo del Viento 34', 1, 1, 1, 1, 26000.00, 1),
(18, 4, 'Hotel Bella Vista', 'Avenida de la Playa 101', 2, 2, 2, 1, 28000.00, 1),
(19, 5, 'Hotel Puerta del Sol', 'Calle de la Luna 45', 4, 4, 4, 2, 24000.00, 1),
(20, 5, 'Hostal Refugio del Mar', 'Calle del Faro 33', 3, 2, 3, 1, 30000.00, 1),
(21, 5, 'Hostal Sierra Nevada', 'Camino de las Montañas 22', 3, 2, 3, 2, 26000.00, 1),
(22, 5, 'Hotel Jardines del Edén', 'Calle de los Jardines 78', 1, 1, 1, 1, 23000.00, 1),
(23, 6, 'Hotel Costa del Sol', 'Avenida del Mar 200', 5, 4, 6, 3, 32000.00, 1),
(24, 6, 'Hostal Paraíso del Norte', 'Calle de la Montaña 15', 3, 2, 2, 1, 29000.00, 1),
(25, 7, 'Hostal Refugio de la Selva', 'Calle Verde 67', 3, 2, 3, 2, 31000.00, 1),
(26, 7, 'Posada Rayo de Sol', 'Paseo del Sol 42', 6, 4, 5, 2, 27000.00, 1),
(27, 7, 'Hotel Mar y Tierra', 'Calle del Océano 88', 4, 2, 2, 1, 34000.00, 1),
(28, 8, 'Hostal Encanto del Valle', 'Calle del Valle 55', 3, 2, 4, 2, 35000.00, 1),
(29, 8, 'Hotel Horizonte Azul', 'Avenida de los Horizontes 99', 1, 1, 1, 1, 36000.00, 1),
(30, 9, 'Posada Refugio del Océano', 'Calle de la Brisa 12', 6, 4, 5, 2, 37000.00, 1),
(31, 9, 'Hotel Cumbres del Sur', 'Camino de las Cumbres 45', 3, 2, 2, 1, 38000.00, 1),
(32, 9, 'Hotel Jardín de los Sueños', 'Calle de los Sueños 78', 6, 4, 6, 3, 39000.00, 1),
(33, 10, 'Hostal La Amistad', 'Calle de la Amistad 34', 5, 3, 4, 2, 12000.00, 1),
(34, 10, 'Cabañas El Refugio', 'Ruta 40 Km 12', 6, 4, 6, 3, 20000.00, 1),
(35, 11, 'Hotel Ciudad de Luz', 'Avenida Libertador 55', 5, 4, 5, 2, 25000.00, 1),
(36, 11, 'Posada El Descanso', 'Calle de los Pinos 22', 1, 1, 1, 1, 18000.00, 1),
(37, 11, 'Hostal El Camino', 'Calle del Sendero 10', 4, 3, 4, 2, 15000.00, 1),
(38, 12, 'Cabañas del Lago', 'Avenida del Lago 88', 5, 3, 5, 2, 22000.00, 1),
(39, 12, 'Hotel Oasis del Mar', 'Calle del Mar 15', 7, 5, 7, 3, 30000.00, 1),
(40, 13, 'Posada Los Abuelos', 'Calle de la Familia 44', 2, 1, 1, 1, 17000.00, 1),
(41, 13, 'Hostal La Esperanza', 'Calle de la Esperanza 5', 3, 2, 3, 1, 13000.00, 1),
(42, 13, 'Cabañas Sol y Sombra', 'Camino de las Cabañas 50', 3, 2, 2, 1, 24000.00, 1),
(43, 14, 'Hostal El Nido', 'Calle del Nido 18', 5, 3, 4, 2, 14000.00, 1),
(44, 14, 'Cabañas Rincón del Bosque', 'Sendero del Bosque 27', 1, 1, 1, 1, 21000.00, 1),
(45, 14, 'Hotel Estrella Brillante', 'Avenida de las Estrellas 33', 5, 4, 5, 2, 26000.00, 1),
(46, 15, 'Posada La Tranquilidad', 'Calle de la Paz 72', 2, 1, 1, 1, 19000.00, 1),
(47, 15, 'Hostal Viaje Soñado', 'Calle de los Sueños 29', 2, 2, 2, 1, 15500.00, 1),
(48, 15, 'Cabañas Refugio del Sol', 'Camino del Sol 11', 5, 4, 5, 2, 23000.00, 1),
(49, 16, 'Hotel Cielo Estrellado', 'Avenida de la Noche 88', 4, 4, 4, 2, 28000.00, 1),
(50, 16, 'Posada El Jardín Secreto', 'Calle de los Jardines 55', 3, 2, 2, 1, 17500.00, 1),
(51, 16, 'Hostal Puerta del Amanecer', 'Calle del Amanecer 34', 1, 1, 1, 1, 16000.00, 1),
(52, 16, 'Cabañas Paraíso Escondido', 'Sendero Escondido 90', 3, 3, 3, 1, 24000.00, 1),
(53, 1, 'Posada Del Bosque Encantado', 'Calle de los Pinos 21', 6, 4, 3, 2, 25000.00, 1),
(54, 2, 'Hostal El Refugio del Lago', 'Avenida del Lago 90', 8, 5, 4, 3, 28000.00, 1),
(55, 3, 'Hotel Aurora Boreal', 'Calle de las Estrellas 5', 10, 2, 3, 2, 32000.00, 1),
(56, 4, 'Cabañas Vista Hermosa', 'Camino del Bosque 12', 7, 3, 2, 1, 21000.00, 1),
(57, 5, 'Posada Los Alamos', 'Avenida de la Paz 77', 4, 2, 1, 1, 19000.00, 1),
(58, 6, 'Hostal Camino del Sol', 'Calle del Sol 22', 9, 3, 4, 2, 27000.00, 1),
(59, 7, 'Hotel La Cascada', 'Paseo de la Cascada 45', 5, 4, 2, 3, 30000.00, 1),
(60, 8, 'Cabañas Nido del Águila', 'Calle de las Montañas 18', 6, 3, 3, 2, 29000.00, 1),
(61, 9, 'Hostal Brisas del Mar', 'Avenida de la Brisa 99', 3, 1, 1, 1, 16000.00, 1),
(62, 10, 'Hotel Horizonte Infinito', 'Calle del Horizonte 67', 8, 4, 4, 3, 35000.00, 1),
(63, 11, 'Cabañas Refugio de las Nubes', 'Calle de las Nubes 19', 5, 2, 2, 1, 18000.00, 1),
(64, 12, 'Posada Valle Escondido', 'Camino del Valle 34', 7, 3, 3, 2, 27000.00, 1),
(65, 13, 'Hostal Sueños del Mar', 'Calle del Mar 50', 6, 2, 2, 1, 21000.00, 1),
(66, 14, 'Hotel Rincón del Sol', 'Calle de la Playa 88', 5, 3, 3, 2, 23000.00, 1),
(67, 15, 'Cabañas del Horizonte', 'Camino de los Horizontes 21', 4, 2, 1, 1, 20000.00, 1),
(68, 16, 'Hostal Mirador del Valle', 'Calle de los Miradores 34', 9, 5, 4, 3, 34000.00, 1),
(69, 1, 'Hotel Paraíso Perdido', 'Calle de la Tranquilidad 12', 4, 2, 2, 1, 22000.00, 1),
(70, 2, 'Posada El Encanto', 'Avenida del Sol 45', 6, 3, 3, 2, 24000.00, 1),
(71, 3, 'Cabañas Rincón de los Sueños', 'Calle de la Luna 9', 5, 2, 2, 1, 21000.00, 1),
(72, 4, 'Hostal Valle Secreto', 'Paseo del Valle 16', 8, 4, 4, 2, 30000.00, 1),
(73, 5, 'Hotel Maravillas Naturales', 'Calle de la Naturaleza 22', 3, 1, 1, 1, 16000.00, 1),
(74, 6, 'Cabañas Refugio del Cielo', 'Calle del Cielo 34', 7, 3, 3, 2, 28000.00, 1),
(75, 7, 'Posada del Río', 'Avenida del Río 55', 4, 2, 2, 1, 19000.00, 1),
(76, 8, 'Hostal El Valle Azul', 'Calle del Valle 20', 5, 3, 3, 2, 21000.00, 1),
(77, 9, 'Hotel La Vista', 'Calle de la Vista 18', 6, 4, 2, 1, 23000.00, 1),
(78, 10, 'Cabañas del Océano', 'Camino del Océano 21', 8, 5, 4, 3, 35000.00, 1),
(79, 11, 'Posada del Ocaso', 'Avenida del Ocaso 30', 3, 2, 1, 1, 18000.00, 1),
(80, 12, 'Hostal La Brisa Marina', 'Calle del Mar 14', 9, 4, 3, 2, 26000.00, 1),
(81, 13, 'Hotel Colina Verde', 'Calle de la Colina 75', 5, 3, 2, 1, 21000.00, 1),
(82, 14, 'Cabañas del Desierto', 'Calle del Desierto 90', 4, 2, 2, 1, 20000.00, 1),
(83, 15, 'Hostal Sueños del Bosque', 'Calle del Bosque 50', 6, 4, 3, 2, 27000.00, 1),
(84, 16, 'Hotel Oasis del Valle', 'Avenida del Oasis 66', 7, 3, 3, 2, 29000.00, 1),
(85, 1, 'Cabañas Refugio del Águila', 'Calle de la Águila 15', 5, 3, 2, 1, 25000.00, 1),
(86, 2, 'Hostal El Sol Naciente', 'Avenida del Sol 80', 4, 2, 2, 1, 20000.00, 1),
(87, 3, 'Hotel Valle del Sueño', 'Calle del Sueño 27', 7, 4, 3, 2, 31000.00, 1),
(88, 4, 'Cabañas del Bosque Profundo', 'Paseo del Bosque 44', 6, 3, 2, 1, 24000.00, 1),
(89, 5, 'Posada Brisas del Norte', 'Calle del Norte 12', 8, 5, 4, 2, 35000.00, 1),
(90, 6, 'Hostal Mar de Nubes', 'Calle de las Nubes 11', 3, 2, 1, 1, 16000.00, 1),
(91, 7, 'Hotel Refugio del Océano', 'Avenida del Océano 33', 9, 4, 3, 2, 29000.00, 1),
(92, 8, 'Cabañas Jardín de los Sueños', 'Calle del Jardín 55', 4, 2, 2, 1, 22000.00, 1),
(93, 9, 'Posada Puente del Mar', 'Calle del Puente 30', 6, 3, 2, 1, 24000.00, 1),
(94, 10, 'Hostal Viento del Este', 'Calle del Viento 25', 5, 2, 3, 2, 21000.00, 1),
(95, 11, 'Hotel La Ruta del Sol', 'Calle de la Ruta 44', 8, 4, 4, 3, 32000.00, 1),
(96, 12, 'Cabañas Colinas Verdes', 'Camino de las Colinas 66', 7, 3, 2, 1, 27000.00, 1),
(97, 13, 'Posada Estrellas del Norte', 'Calle de las Estrellas 29', 5, 2, 2, 1, 19000.00, 1),
(98, 14, 'Hostal Eco del Mar', 'Calle del Eco 18', 4, 2, 2, 1, 21000.00, 1),
(99, 15, 'Hotel Rincón del Mar', 'Avenida del Mar 60', 6, 4, 3, 2, 28000.00, 1),
(100, 16, 'Cabañas del Refugio Verde', 'Sendero Verde 72', 8, 5, 4, 2, 30000.00, 1),
(101, 1, 'Hotel Las Estrellas', 'Calle de las Estrellas 15', 4, 2, 2, 1, 23000.00, 1),
(102, 2, 'Posada Aventura', 'Avenida de la Aventura 40', 5, 3, 3, 2, 25000.00, 1),
(103, 3, 'Hostal Entre Amigos', 'Calle de la Amistad 22', 6, 4, 3, 2, 27000.00, 1),
(104, 4, 'Cabañas Sueños de Mar', 'Paseo del Mar 12', 8, 5, 4, 2, 36000.00, 1),
(105, 5, 'Hotel Sol y Sombra', 'Calle del Sol 34', 3, 1, 1, 1, 15000.00, 1),
(106, 6, 'Hostal Noche Estrellada', 'Avenida de las Estrellas 5', 7, 4, 3, 2, 28000.00, 1),
(107, 7, 'Cabañas Refugio de la Luz', 'Calle de la Luz 28', 5, 3, 2, 1, 24000.00, 1),
(108, 8, 'Posada Río Sereno', 'Calle del Río 39', 9, 4, 4, 3, 32000.00, 1),
(109, 9, 'Hotel Arco Iris', 'Avenida del Arco 19', 6, 2, 2, 1, 21000.00, 1),
(110, 10, 'Hostal Eco del Valle', 'Calle del Eco 50', 4, 3, 2, 1, 22000.00, 1),
(111, 11, 'Cabañas Vista al Lago', 'Paseo del Lago 33', 5, 2, 2, 1, 23000.00, 1),
(112, 12, 'Hotel Jardín del Cielo', 'Calle del Jardín 42', 6, 4, 3, 2, 27000.00, 1),
(113, 13, 'Posada Mar y Tierra', 'Calle del Mar 36', 3, 1, 1, 1, 19000.00, 1),
(114, 14, 'Cabañas Sol de Invierno', 'Calle del Invierno 15', 8, 5, 4, 2, 30000.00, 1),
(115, 15, 'Hotel Camino de las Flores', 'Calle de las Flores 49', 5, 2, 2, 1, 18000.00, 1),
(116, 16, 'Hostal Valle de Luz', 'Calle del Valle 12', 6, 3, 3, 2, 26000.00, 1),
(117, 1, 'Cabañas de la Sierra', 'Calle de la Sierra 70', 5, 3, 2, 1, 22000.00, 1),
(118, 2, 'Hotel Vista del Mar', 'Avenida de la Vista 25', 4, 2, 2, 1, 21000.00, 1),
(119, 3, 'Hostal Tierra y Mar', 'Calle del Mar 60', 6, 4, 3, 2, 24000.00, 1),
(120, 4, 'Posada La Esperanza', 'Calle de la Esperanza 8', 8, 4, 4, 2, 32000.00, 1),
(121, 5, 'Cabañas Valle Encantado', 'Paseo Encantado 44', 7, 5, 3, 2, 30000.00, 1),
(122, 6, 'Hotel Sombra del Bosque', 'Calle del Bosque 90', 5, 3, 2, 1, 20000.00, 1),
(123, 7, 'Hostal Rincón del Mar', 'Calle del Rincón 52', 9, 4, 4, 3, 35000.00, 1),
(124, 8, 'Cabañas de las Flores', 'Avenida de las Flores 27', 4, 2, 2, 1, 18000.00, 1),
(125, 9, 'Hotel Cielo Azul', 'Calle del Cielo 11', 6, 3, 3, 2, 26000.00, 1),
(126, 10, 'Posada Lago Sereno', 'Calle del Lago 48', 5, 3, 2, 1, 23000.00, 1),
(127, 11, 'Cabañas en la Nieve', 'Calle de la Nieve 19', 4, 2, 2, 1, 25000.00, 1),
(128, 12, 'Hotel Mar y Cielo', 'Avenida del Mar 33', 7, 4, 3, 2, 29000.00, 1),
(129, 13, 'Hostal El Refugio', 'Calle del Refugio 30', 5, 2, 2, 1, 17000.00, 1),
(130, 14, 'Cabañas del Paraíso', 'Sendero del Paraíso 8', 6, 3, 3, 2, 28000.00, 1),
(131, 15, 'Hotel Luz del Amanecer', 'Calle del Amanecer 22', 4, 1, 1, 1, 19000.00, 1),
(132, 16, 'Posada Río del Cielo', 'Calle del Río 45', 8, 5, 4, 3, 31000.00, 1),
(133, 1, 'Hotel Palmera', 'Avenida de las Palmeras 50', 6, 3, 3, 2, 24000.00, 1),
(134, 2, 'Cabañas del Sol', 'Calle del Sol 14', 4, 2, 2, 1, 18000.00, 1),
(135, 3, 'Posada La Cascada', 'Calle de la Cascada 32', 5, 3, 2, 1, 21000.00, 1),
(136, 4, 'Hostal Rincón del Viento', 'Calle del Viento 27', 8, 4, 4, 2, 30000.00, 1),
(137, 5, 'Hotel Refugio del Valle', 'Paseo del Valle 10', 7, 5, 3, 2, 35000.00, 1),
(138, 6, 'Cabañas El Mirador', 'Calle del Mirador 18', 5, 3, 2, 1, 23000.00, 1),
(139, 7, 'Hotel Brisa Marina', 'Avenida de la Brisa 40', 9, 4, 4, 3, 40000.00, 1),
(140, 8, 'Posada del Río Claro', 'Calle del Río Claro 15', 4, 2, 2, 1, 20000.00, 1),
(141, 9, 'Hostal Jardín del Mar', 'Avenida del Jardín 29', 6, 3, 3, 2, 27000.00, 1),
(142, 10, 'Cabañas de la Montaña', 'Calle de la Montaña 12', 5, 2, 2, 1, 19000.00, 1),
(143, 11, 'Hotel Olas del Mar', 'Calle de las Olas 34', 7, 4, 3, 2, 31000.00, 1),
(144, 12, 'Posada Estrella del Sur', 'Calle del Sur 28', 6, 3, 2, 1, 25000.00, 1),
(145, 13, 'Hostal Cumbres del Norte', 'Calle del Norte 11', 4, 2, 2, 1, 21000.00, 1),
(146, 14, 'Cabañas del Lago', 'Calle del Lago 30', 8, 5, 4, 3, 33000.00, 1),
(147, 15, 'Hotel Selva Mística', 'Avenida de la Selva 50', 5, 2, 2, 1, 18000.00, 1),
(148, 16, 'Posada Vista del Horizonte', 'Calle del Horizonte 22', 6, 4, 3, 2, 26000.00, 1),
(149, 1, 'Hostal Vista del Atardecer', 'Calle del Atardecer 15', 6, 3, 3, 2, 25000.00, 1),
(150, 2, 'Cabañas Refugio del Lago', 'Avenida del Lago 50', 4, 2, 2, 1, 19000.00, 1),
(151, 3, 'Hotel Valle Encantado', 'Calle Encantada 29', 5, 4, 3, 2, 23000.00, 1),
(152, 4, 'Posada Jardín Secreto', 'Calle Secreta 10', 8, 3, 4, 2, 30000.00, 1),
(153, 5, 'Hotel Cielo Claro', 'Calle de la Luz 28', 7, 5, 4, 2, 36000.00, 1),
(154, 6, 'Hostal Rayo de Luna', 'Calle de la Luna 12', 5, 3, 3, 1, 22000.00, 1),
(155, 7, 'Cabañas del Desierto', 'Avenida del Desierto 33', 9, 4, 4, 3, 40000.00, 1),
(156, 8, 'Hotel Refugio Natural', 'Calle de la Naturaleza 14', 4, 2, 2, 1, 20000.00, 1),
(157, 9, 'Posada Mariposa', 'Avenida de las Mariposas 18', 6, 3, 2, 2, 28000.00, 1),
(158, 10, 'Hostal Sol y Mar', 'Calle del Sol 22', 5, 2, 2, 1, 24000.00, 1),
(159, 11, 'Cabañas en la Costa', 'Calle de la Costa 40', 7, 4, 3, 2, 32000.00, 1),
(160, 12, 'Hotel Oasis del Río', 'Calle del Río 30', 6, 3, 3, 2, 27000.00, 1),
(161, 13, 'Posada El Bosque', 'Sendero del Bosque 20', 8, 4, 4, 3, 29000.00, 1),
(162, 14, 'Hostal Estrella del Valle', 'Calle del Valle 25', 5, 2, 2, 1, 20000.00, 1),
(163, 15, 'Cabañas del Amanecer', 'Calle del Amanecer 10', 4, 2, 2, 1, 18000.00, 1),
(164, 16, 'Hotel Refugio del Viento', 'Avenida del Viento 19', 6, 3, 3, 2, 26000.00, 1),
(165, 1, 'Cabañas Entre Ríos', 'Calle del Río 8', 6, 3, 3, 2, 25000.00, 1),
(166, 2, 'Hotel Estrella de Mar', 'Calle del Mar 26', 7, 4, 4, 3, 31000.00, 1),
(167, 3, 'Hostal Oasis de Luz', 'Avenida de la Luz 12', 5, 2, 2, 1, 23000.00, 1),
(168, 4, 'Posada Sol y Sombra', 'Calle del Sombra 45', 8, 4, 3, 2, 30000.00, 1),
(169, 5, 'Hotel Paraíso Natural', 'Calle Natural 36', 6, 3, 3, 2, 28000.00, 1),
(170, 6, 'Cabañas Vista del Lago', 'Avenida del Lago 22', 4, 2, 2, 1, 19000.00, 1),
(171, 7, 'Hostal Valle del Sol', 'Calle del Sol 50', 9, 4, 4, 3, 40000.00, 1),
(172, 8, 'Hotel Rincón de las Flores', 'Calle de las Flores 18', 5, 2, 2, 1, 24000.00, 1),
(173, 9, 'Posada del Bosque Encantado', 'Calle Encantada 19', 8, 5, 4, 3, 35000.00, 1),
(174, 10, 'Hostal Sueños del Mar', 'Avenida del Mar 29', 7, 3, 3, 2, 30000.00, 1),
(175, 11, 'Cabañas en la Selva', 'Calle de la Selva 33', 6, 4, 3, 2, 27000.00, 1),
(176, 12, 'Hotel La Brisa del Océano', 'Calle del Océano 15', 5, 2, 2, 1, 21000.00, 1),
(177, 13, 'Posada Refugio del Viento', 'Avenida del Viento 40', 4, 2, 2, 1, 20000.00, 1),
(178, 14, 'Cabañas del Atardecer', 'Calle del Atardecer 20', 6, 3, 3, 2, 25000.00, 1),
(179, 15, 'Hostal Estrella del Norte', 'Calle del Norte 24', 5, 2, 2, 1, 19000.00, 1),
(180, 16, 'Hotel Rayo de Sol', 'Avenida del Sol 11', 8, 4, 4, 3, 36000.00, 1),
(181, 17, ' Pousada Louse', 'Centro, Balneário Camboriú', 8, 3, 8, 3, 20000.00, 1),
(183, 18, 'Cabañas Las Marías', 'Brachieri 50, A4427 Cafayate', 5, 4, 4, 2, 30700.00, 1),
(184, 21, 'Hotel Bagu Playa Grande', 'Leandro N. Alem 3528, B7600 Mar del Plata, Provincia de Buenos Aires', 6, 4, 6, 3, 42280.00, 1),
(185, 19, 'Posada El Viñedo', 'Centro de Mendoza, en Paseo Alameda y las Ruinas de San Francisco', 2, 2, 2, 2, 34500.00, 1),
(186, 20, 'Hotel Sky Gramado', 'Av. das Hortensias, 680 - Planalto, Gramado', 12, 12, 12, 5, 31900.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `documento` bigint(11) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `apellido`, `documento`, `correo`, `telefono`) VALUES
(1, 'Juan ', 'Martinez', 13049699, '2664747474', 'hernandezchrist'),
(2, 'Pedro', 'Sanchez', 43840001, '2665101021', ' kristin73@brow'),
(3, 'José', 'Rodriguez', 40901232, '2664001123', 'heathersmith@bi'),
(4, 'Gabriela ', 'Hernandez', 29013341, '2665443292', 'Gabii11@gmail.c'),
(5, 'Ana', 'Perez', 21652212, '2665218312', 'Anita1@hotmail.'),
(6, 'Juan', 'Ramirez', 33988900, '2665981211', 'juan0033@gmail.'),
(7, 'Pamela', 'Torres', 45326363, '2664119292', 'pamelaT@hotmail'),
(8, 'l', 'l', 1, '1', 'l'),
(9, 'lo', 'lo', 22, '44', 'lol'),
(10, 'l', 'l', 1, '1', 'l'),
(11, 'laa', 'laa', 11, '2', 'aaaaaaa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destino`
--

CREATE TABLE `destino` (
  `idDestino` int(11) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  `lugar` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `destino`
--

INSERT INTO `destino` (`idDestino`, `ciudad`, `lugar`) VALUES
(1, 'Buenos Aires', 'Puerto Madero'),
(2, 'Buenos Aires', 'La Boca'),
(3, 'Buenos Aires', 'Palermo'),
(4, 'Buenos Aires', 'Recoleta'),
(5, 'Neuquen', 'El Volcán Copahue'),
(6, 'Neuquen', 'El Lago Huechulafquen'),
(7, 'Rio Negro', 'El Lago Nahuel Huapi'),
(8, 'Rio Negro', 'Bariloche'),
(9, 'Rio Negro', 'Cerro Catedral'),
(10, 'Salta', 'El tren de las nubes'),
(11, 'Salta', 'El Valle de Lerma'),
(12, 'Salta', 'La Puna'),
(13, 'Jujuy', 'La Quebrada de Humahuaca'),
(14, 'Jujuy', 'El Cerro de los Siete Colores'),
(15, 'Misiones', 'Las Cataratas del Iguazú'),
(16, 'Misiones', 'Parque Nacional Iguazú'),
(17, 'Santa Catarina - Brasil', 'Camboriú'),
(18, 'Jujuy', 'Cafayate'),
(19, 'Mendoza', 'Parque provincial Aconcagua'),
(20, 'Río Grande del Sur - Brasil', 'Gramado y Canela'),
(21, 'Buenos Aires', 'Mar del Plata');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadia`
--

CREATE TABLE `estadia` (
  `idEstadia` int(11) NOT NULL,
  `idAlojamiento` int(11) NOT NULL,
  `fechaCheckIn` date NOT NULL,
  `fechaCheckOut` date NOT NULL,
  `total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estadia`
--

INSERT INTO `estadia` (`idEstadia`, `idAlojamiento`, `fechaCheckIn`, `fechaCheckOut`, `total`) VALUES
(1, 181, '2025-01-03', '2025-01-29', 520000.00),
(2, 29, '2025-07-17', '2025-07-22', 180000.00),
(3, 99, '2025-07-24', '2025-07-26', 56000.00),
(4, 184, '2025-01-06', '2025-01-14', 338240.00),
(5, 185, '2025-07-20', '2025-07-26', 207000.00),
(6, 186, '2025-03-28', '2025-04-01', 127600.00),
(7, 4, '2025-06-20', '2025-06-23', 24000.00),
(8, 69, '2024-11-02', '2024-11-03', 23000.00),
(9, 16, '2024-11-02', '2024-11-29', 567000.00),
(10, 3, '2024-11-02', '2024-11-14', 144000.00),
(11, 3, '2024-11-02', '2024-11-11', 108000.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `idMenu` int(11) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `porcentaje` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`idMenu`, `tipo`, `porcentaje`) VALUES
(1, 'Sin_Pension', 0.00),
(2, 'Desayuno', 0.02),
(3, 'Media_Pension', 0.05),
(4, 'Pension_Completa', 0.10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

CREATE TABLE `paquete` (
  `idPaquete` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idEstadia` int(11) DEFAULT NULL,
  `idPasaje` int(11) DEFAULT NULL,
  `idMenu` int(11) NOT NULL,
  `origen` int(11) DEFAULT NULL,
  `destino` int(11) DEFAULT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `temporada` varchar(100) NOT NULL,
  `cantidadPasajeros` int(11) NOT NULL,
  `medioPago` varchar(100) NOT NULL,
  `pagado` tinyint(1) NOT NULL,
  `cancelado` tinyint(1) NOT NULL,
  `precioTotal` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paquete`
--

INSERT INTO `paquete` (`idPaquete`, `idCliente`, `idEstadia`, `idPasaje`, `idMenu`, `origen`, `destino`, `fechaInicio`, `fechaFin`, `temporada`, `cantidadPasajeros`, `medioPago`, `pagado`, `cancelado`, `precioTotal`) VALUES
(1, 1, 1, 1, 2, 1, 17, '2025-01-02', '2025-01-30', 'temporada_baja', 1, 'Mercado Pago', 1, 0, 550800.00),
(2, 2, 2, 2, 3, 1, 8, '2025-07-16', '2025-07-23', 'temporada_alta', 1, 'Tarjeta de débito', 1, 0, 202650.00),
(3, 3, 3, 3, 4, 1, 15, '2025-07-23', '2025-07-27', 'temporada_alta', 1, 'Tarjeta de crédito', 1, 0, 75900.00),
(4, 4, 4, 4, 2, 1, 21, '2025-01-05', '2025-01-15', 'temporada_baja', 1, 'Mercado Pago', 1, 0, 365404.80),
(5, 5, 5, 5, 2, 1, 19, '2025-07-19', '2025-07-27', 'temporada_alta', 1, 'Tarjeta de crédito', 1, 0, 231540.00),
(6, 6, 6, 6, 2, 1, 20, '2025-03-27', '2025-04-02', 'temporada_media', 1, 'Efectivo', 1, 0, 150552.00),
(7, 7, 7, 7, 2, 1, 2, '2025-06-19', '2025-06-24', 'temporada_baja', 1, 'Tarjeta de débito', 1, 0, 37740.00),
(8, 8, 8, 8, 1, 1, 1, '2024-11-01', '2024-11-30', 'temporada_media', 14, 'Efectivo', 1, 0, 884940.00),
(9, 9, 9, 9, 4, 1, 4, '2024-11-01', '2024-11-30', 'temporada_media', 1, 'Efectivo', 1, 0, 58000.00),
(10, 10, 10, 10, 4, 1, 1, '2024-11-01', '2024-11-30', 'temporada_media', 1, 'Tarjeta de crédito', 1, 0, 16720.00),
(11, 11, 11, 11, 2, 1, 1, '2024-11-01', '2024-11-30', 'temporada_media', 1, 'Tarjeta de crédito', 1, 0, 12342.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `idPasaje` int(11) NOT NULL,
  `asiento` int(11) DEFAULT NULL,
  `idTransporte` int(11) DEFAULT NULL,
  `origen` int(11) DEFAULT NULL,
  `destino` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pasaje`
--

INSERT INTO `pasaje` (`idPasaje`, `asiento`, `idTransporte`, `origen`, `destino`) VALUES
(1, 39, 1, 1, 17),
(2, 10, 2, 1, 8),
(3, 16, 2, 1, 15),
(4, 18, 1, 1, 21),
(5, 37, 1, 1, 19),
(6, 19, 1, 1, 20),
(7, 31, 2, 1, 2),
(8, 31, 1, 1, 1),
(9, 5, 2, 1, 4),
(10, 18, 1, 1, 1),
(11, 37, 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transporte`
--

CREATE TABLE `transporte` (
  `idTransporte` int(11) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `costo` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `transporte`
--

INSERT INTO `transporte` (`idTransporte`, `tipo`, `costo`) VALUES
(1, 'Avión', 20000.00),
(2, 'Colectivo', 13000.00),
(3, 'Compartido', 8000.00),
(4, 'Ninguno', 0.00);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD PRIMARY KEY (`idAlojamiento`),
  ADD KEY `idDestino` (`idDestino`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`idDestino`);

--
-- Indices de la tabla `estadia`
--
ALTER TABLE `estadia`
  ADD PRIMARY KEY (`idEstadia`),
  ADD KEY `idAlojamiento` (`idAlojamiento`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`idMenu`);

--
-- Indices de la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD PRIMARY KEY (`idPaquete`),
  ADD KEY `idEstadia` (`idEstadia`),
  ADD KEY `idPasaje` (`idPasaje`),
  ADD KEY `idMenu` (`idMenu`),
  ADD KEY `origen` (`origen`),
  ADD KEY `fk_destino_paqt` (`destino`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`idPasaje`),
  ADD KEY `fk_transporte` (`idTransporte`),
  ADD KEY `fk_origen` (`origen`),
  ADD KEY `fk_destino_pqt` (`destino`);

--
-- Indices de la tabla `transporte`
--
ALTER TABLE `transporte`
  ADD PRIMARY KEY (`idTransporte`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  MODIFY `idAlojamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=187;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `destino`
--
ALTER TABLE `destino`
  MODIFY `idDestino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `estadia`
--
ALTER TABLE `estadia`
  MODIFY `idEstadia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `menu`
--
ALTER TABLE `menu`
  MODIFY `idMenu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `paquete`
--
ALTER TABLE `paquete`
  MODIFY `idPaquete` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `idPasaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `transporte`
--
ALTER TABLE `transporte`
  MODIFY `idTransporte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD CONSTRAINT `fk_destino_aloj` FOREIGN KEY (`idDestino`) REFERENCES `destino` (`idDestino`);

--
-- Filtros para la tabla `estadia`
--
ALTER TABLE `estadia`
  ADD CONSTRAINT `fk_alojamiento` FOREIGN KEY (`idAlojamiento`) REFERENCES `alojamiento` (`idAlojamiento`);

--
-- Filtros para la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD CONSTRAINT `fk_destino_paqt` FOREIGN KEY (`destino`) REFERENCES `destino` (`idDestino`),
  ADD CONSTRAINT `fk_estadia_pqt` FOREIGN KEY (`idEstadia`) REFERENCES `estadia` (`idEstadia`),
  ADD CONSTRAINT `fk_idCliente_pqt` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `fk_menu_pqt` FOREIGN KEY (`idMenu`) REFERENCES `menu` (`idMenu`),
  ADD CONSTRAINT `fk_origen_pqt` FOREIGN KEY (`origen`) REFERENCES `destino` (`idDestino`),
  ADD CONSTRAINT `fk_pasaje_pqt` FOREIGN KEY (`idPasaje`) REFERENCES `pasaje` (`idPasaje`);

--
-- Filtros para la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `fk_destino` FOREIGN KEY (`destino`) REFERENCES `destino` (`idDestino`),
  ADD CONSTRAINT `fk_destino_pqt` FOREIGN KEY (`destino`) REFERENCES `destino` (`idDestino`),
  ADD CONSTRAINT `fk_origen` FOREIGN KEY (`origen`) REFERENCES `destino` (`idDestino`),
  ADD CONSTRAINT `fk_transporte` FOREIGN KEY (`idTransporte`) REFERENCES `transporte` (`idTransporte`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
