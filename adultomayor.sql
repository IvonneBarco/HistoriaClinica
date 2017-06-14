-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-09-2016 a las 19:54:25
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `adultomayor`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `id` int(11) NOT NULL,
  `departamento` varchar(100) COLLATE utf8_bin NOT NULL,
  `codigo` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `id_pais` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`id`, `departamento`, `codigo`, `id_pais`) VALUES
(1, 'Amazonas', '001', 1),
(2, 'Antioquia', '002', 1),
(3, 'Arauca', NULL, 1),
(4, 'Atlantico', NULL, 1),
(5, 'Bolivar', NULL, 1),
(6, 'Boyaca', NULL, 1),
(7, 'Caldas', NULL, 1),
(8, 'Caqueta', NULL, 1),
(9, 'Casanare', NULL, 1),
(10, 'Cauca', NULL, 1),
(11, 'Cesar', NULL, 1),
(12, 'Choco', NULL, 1),
(13, 'Cordoba', NULL, 1),
(14, 'Cundinamarca', NULL, 1),
(15, 'Guainia', NULL, 1),
(16, 'Guaviare', NULL, 1),
(17, 'Huila', NULL, 1),
(18, 'La Guajira', NULL, 1),
(19, 'Magdalena', NULL, 1),
(20, 'Meta', NULL, 1),
(21, 'Nariño', NULL, 1),
(22, 'Norte de Santander', NULL, 1),
(23, 'Putumayo', NULL, 1),
(24, 'Quindio', NULL, 1),
(25, 'Risaralda', NULL, 1),
(26, 'San Andres', NULL, 1),
(27, 'Santander', NULL, 1),
(28, 'Sucre', '', 1),
(29, 'Tolima', NULL, 1),
(30, 'Valle del Cauca', NULL, 1),
(31, 'Vaupes', NULL, 1),
(32, 'Vichada', NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encuestas`
--

CREATE TABLE `encuestas` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `encuestador` varchar(150) COLLATE utf8_bin NOT NULL,
  `fecha_encuesta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_ult_act` timestamp NULL DEFAULT NULL,
  `observaciones` mediumtext COLLATE utf8_bin,
  `codigo_encuesta` varchar(100) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados_civiles`
--

CREATE TABLE `estados_civiles` (
  `id` int(11) NOT NULL,
  `estado_civil` varchar(50) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `estados_civiles`
--

INSERT INTO `estados_civiles` (`id`, `estado_civil`, `abreviatura`) VALUES
(1, 'Soltero(a)', 'Solt'),
(2, 'Casado(a)', 'Cas'),
(3, 'Union Libre', 'UnL'),
(4, 'Viudo(a)', 'Viu'),
(5, 'Separado(a)', 'Sep');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupos_convivientes`
--

CREATE TABLE `grupos_convivientes` (
  `id` int(11) NOT NULL,
  `grupo` varchar(100) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `grupos_convivientes`
--

INSERT INTO `grupos_convivientes` (`id`, `grupo`, `abreviatura`) VALUES
(1, 'Solo(a)', 'Solo'),
(2, 'Con Pareja', 'Par'),
(3, 'Con Pareja-Hijos', 'ParH'),
(4, 'Con Pareja-Hijos-Nietos', 'PHN'),
(5, 'Con Hermanos(as)', 'Herm'),
(6, 'Otros', 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos_mensuales`
--

CREATE TABLE `ingresos_mensuales` (
  `id` int(11) NOT NULL,
  `ingresos_rango` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `ingresos_mensuales`
--

INSERT INTO `ingresos_mensuales` (`id`, `ingresos_rango`) VALUES
(1, '50.000 y 250.000'),
(2, '250.000 y 600.000'),
(3, '600.000 y Mas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

CREATE TABLE `materiales` (
  `id` int(11) NOT NULL,
  `id_tipo_material` int(11) NOT NULL,
  `material` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `materiales`
--

INSERT INTO `materiales` (`id`, `id_tipo_material`, `material`) VALUES
(1, 1, 'Bloque'),
(2, 1, 'Madera'),
(3, 1, 'Ladrillo'),
(4, 1, 'Bareque'),
(5, 1, 'Guadua'),
(6, 1, 'Concreto'),
(7, 1, 'Zinc'),
(8, 1, 'Telas'),
(9, 1, 'Otro'),
(10, 2, 'Tierra'),
(11, 2, 'Baldosa'),
(12, 2, 'Madera'),
(13, 2, 'Cemento'),
(14, 2, 'Ceramica'),
(15, 2, 'Otro'),
(16, 3, 'Teja'),
(17, 3, 'Eternit'),
(18, 3, 'Zinc'),
(19, 3, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `id` int(11) NOT NULL,
  `municipio` varchar(100) COLLATE utf8_bin NOT NULL,
  `codigo` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `id_departamento` int(11) NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `municipios`
--

INSERT INTO `municipios` (`id`, `municipio`, `codigo`, `id_departamento`, `abreviatura`) VALUES
(1, 'Pasto', NULL, 21, NULL),
(2, 'La Unión', NULL, 21, NULL),
(3, 'Buesaco', NULL, 21, NULL),
(4, 'Túquerres', NULL, 21, NULL),
(5, 'Sandoná', NULL, 21, NULL),
(6, 'Samaniego', NULL, 21, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paises`
--

CREATE TABLE `paises` (
  `id` int(11) NOT NULL,
  `pais` varchar(100) COLLATE utf8_bin NOT NULL,
  `codigo` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `paises`
--

INSERT INTO `paises` (`id`, `pais`, `codigo`, `abreviatura`) VALUES
(1, 'Colombia', '001', 'Col');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `id` int(11) NOT NULL,
  `nombres` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `apellidos` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_tipo_identificacion` int(11) DEFAULT NULL,
  `numero_identificacion` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `id_lugar_expedicion` int(11) DEFAULT NULL,
  `id_lugar_nacimiento` int(11) DEFAULT NULL,
  `fecha_nacimiento` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `genero` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `id_estado_civil` int(11) DEFAULT NULL,
  `hijos` varchar(2) COLLATE utf8_bin DEFAULT NULL,
  `nro_hijos` int(3) DEFAULT NULL,
  `id_grupo_conviviente` int(11) DEFAULT NULL,
  `otro_grupo_conviviente` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_escolaridad` int(11) DEFAULT NULL,
  `id_tipo_poblacion` int(11) DEFAULT NULL,
  `afiliacion_salud` varchar(3) COLLATE utf8_bin DEFAULT NULL,
  `tipo_salud` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `eps` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ips` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `discapacidad` varchar(3) COLLATE utf8_bin DEFAULT NULL,
  `caract_discapacidad` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `estilo_vida_saludable` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `adulto_mayor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `grupo_adulto_mayor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `organizacion_comun` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `tipo_ocupacion` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ocupacion` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ingresos` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `fuente_ingresos` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_ingreso_mensual` int(11) DEFAULT NULL,
  `prog_colombia_mayor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ayuda_tecnica_usa` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ayuda_tecnica_requiere` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ayuda_tecnica` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_encuesta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`id`, `nombres`, `apellidos`, `id_tipo_identificacion`, `numero_identificacion`, `id_lugar_expedicion`, `id_lugar_nacimiento`, `fecha_nacimiento`, `edad`, `genero`, `id_estado_civil`, `hijos`, `nro_hijos`, `id_grupo_conviviente`, `otro_grupo_conviviente`, `id_escolaridad`, `id_tipo_poblacion`, `afiliacion_salud`, `tipo_salud`, `eps`, `ips`, `discapacidad`, `caract_discapacidad`, `estilo_vida_saludable`, `adulto_mayor`, `grupo_adulto_mayor`, `organizacion_comun`, `tipo_ocupacion`, `ocupacion`, `ingresos`, `fuente_ingresos`, `id_ingreso_mensual`, `prog_colombia_mayor`, `ayuda_tecnica_usa`, `ayuda_tecnica_requiere`, `ayuda_tecnica`, `id_encuesta`) VALUES
(46, 'Juan', 'Casillas', NULL, '22233312', NULL, NULL, '16/7/2016', 3, 'Masculino', NULL, 'Si', 3, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(51, 'Raul', 'Meneses', NULL, '310002', 1, NULL, '8/7/2016', 43, 'Masculino', NULL, 'Si', 4, NULL, 'Gato', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(52, 'Rafael', 'Gonzalez', NULL, '22222222', 1, NULL, '22/7/2016', 34, 'Masculino', NULL, 'Si', 4, NULL, 'Gato', NULL, NULL, 'Si', 'Subsidiado', 'Cafesalud', 'Clinica Fatima', 'Si', 'Ceguera', 'Si', 'Si', 'Los Veteraos', 'Si', ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(53, 'Alberto', 'Cubillos', 1, '1231234', NULL, NULL, '9/7/2016', 34, 'Masculino', 2, 'Si', 3, 2, '', 1, 1, 'Si', 'Subsidiado', 'fres', 'fres', 'Si', 'des', 'Si', 'Si', 'des', 'Si', ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(54, 'Carlos Alberto', 'Garzon', 1, '12345', NULL, NULL, '9/7/2016', 34, 'Masculino', 1, 'Si', 3, 1, '', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(55, 'Carlos Alberto', 'Garzon Parra', 1, '1234567', NULL, NULL, '9/7/2016', 34, 'Masculino', 1, 'Si', 3, 1, '', 1, 1, 'Si', 'Subsidiado', 'r', 'r', 'Si', 'r', 'Si', 'Si', 'r', 'Si', ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(56, 'Julian Andres', 'Tovar Lagos', 1, '56712', NULL, NULL, '10/7/2016', 34, 'Masculino', 1, 'Si', 3, 1, '', 1, 1, 'Si', 'Subsidiado', 'Sucre', 'Fand', 'Si', '', 'Si', 'Si', '', 'Si', ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(57, 'Julieta', 'Paz Medrano', 1, '300000', NULL, NULL, '9/7/2016', 34, 'Masculino', 1, 'No', 0, 1, '', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(58, 'Fernando ', 'Marin', 1, '342112445', NULL, NULL, '14/7/2016', 23, 'Masculino', 1, 'Si', 3, 1, '', 1, 1, 'Si', 'Subsidiado', 'Seguro Social', 'Ninguna', 'No', '', 'Si', 'No', '', 'Si', ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(59, 'Carlos Alberto', 'Baliun', 1, '111111111', NULL, NULL, '16/7/2016', 32, 'Masculino', 1, 'Si', 4, 1, '', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(60, 'Alberto', 'Morales', 1, '123', NULL, NULL, '8/7/2016', 45, 'Masculino', 1, 'Si', 3, 1, '', 1, 1, 'Si', 'Subsidiado', 'Seguro Social', 'Seguro Social', 'No', '', 'Si', 'No', '', 'Si', ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(61, 'w', 'w', 1, '2', 21, NULL, '1/7/2016', 2, 'Masculino', 1, 'Si', 3, 1, '', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(62, 'Prueba', 'Prueba', 1, '909090', 2, 2, '17/7/2016', 34, 'Masculino', 1, 'Si', 4, 1, '', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(63, 'Carlos', 'Alberto', 1, '108565478', 1, 1, '9/9/2016', 45, 'Masculino', 1, 'Si', 4, 1, '', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(64, 'Ana', 'Maria', 1, '456897', 1, 1, '11/9/2016', 45, 'Masculino', 1, 'Si', 4, 6, 'Perro', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL),
(65, 'Roberto', 'Martinez', 1, '7777', 1, 1, '17/9/2016', 45, 'Masculino', 1, 'Si', 4, 1, '', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ' ', 'Sin Actividad', 'Si', 'Niguna parte', 1, 'Si', 'Si', 'Si', 'Si', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_vivienda`
--

CREATE TABLE `persona_vivienda` (
  `id` int(11) NOT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `id_tipo_vivienda` int(11) DEFAULT NULL,
  `otro_tipo_vivienda` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_departamento` int(11) DEFAULT NULL,
  `id_municipio` int(11) DEFAULT NULL,
  `barrio_vereda` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sector` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `estrato` int(2) DEFAULT NULL,
  `celular` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `condicion_vivienda` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_material_pared` int(11) DEFAULT NULL,
  `otro_material_pared` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_material_piso` int(11) DEFAULT NULL,
  `otro_material_piso` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_material_techo` int(11) DEFAULT NULL,
  `otro_material_techo` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `espacios_separados` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `acceso_independiente` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `nro_pisos` int(2) DEFAULT NULL,
  `nro_alcobas` int(2) DEFAULT NULL,
  `nro_banos` int(2) DEFAULT NULL,
  `nro_cocinas` int(2) DEFAULT NULL,
  `nro_hogares` int(2) DEFAULT NULL,
  `total_personas` int(2) DEFAULT NULL,
  `energia_electrica` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `alcantarillado` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_obtencion_agua` int(11) DEFAULT NULL,
  `otro_obtencion_agua` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_combustible_cocina` int(11) DEFAULT NULL,
  `otro_combustible_cocina` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_elm_basura` int(11) DEFAULT NULL,
  `otro_elm_basura` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_servicio_sanitario` int(11) DEFAULT NULL,
  `otro_servicio_sanitario` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ubicacion_serv_sanitario` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_tenencia_vivienda` int(11) DEFAULT NULL,
  `otro_tenencia_vivienda` varchar(100) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `persona_vivienda`
--

INSERT INTO `persona_vivienda` (`id`, `id_persona`, `id_tipo_vivienda`, `otro_tipo_vivienda`, `id_departamento`, `id_municipio`, `barrio_vereda`, `sector`, `estrato`, `celular`, `condicion_vivienda`, `id_material_pared`, `otro_material_pared`, `id_material_piso`, `otro_material_piso`, `id_material_techo`, `otro_material_techo`, `espacios_separados`, `acceso_independiente`, `nro_pisos`, `nro_alcobas`, `nro_banos`, `nro_cocinas`, `nro_hogares`, `total_personas`, `energia_electrica`, `alcantarillado`, `id_obtencion_agua`, `otro_obtencion_agua`, `id_combustible_cocina`, `otro_combustible_cocina`, `id_elm_basura`, `otro_elm_basura`, `id_servicio_sanitario`, `otro_servicio_sanitario`, `ubicacion_serv_sanitario`, `id_tenencia_vivienda`, `otro_tenencia_vivienda`) VALUES
(2, NULL, NULL, NULL, NULL, NULL, 'Caldas', 'Rural', 1, '324566', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 46, NULL, 'tres', NULL, NULL, 'Villa Nueva', 'Rural', 1, '3215467', 'Buena', NULL, 'tres', NULL, 'tres', NULL, 'tres', 'Si', 'Si', 4, 5, 4, 5, 4, 4, 'Si', 'Si', NULL, 'uno', NULL, 'dos', NULL, 'tres', NULL, 'cuatro', 'Dentro de la Vivienda', NULL, 'alquilada'),
(4, 52, 1, '', NULL, NULL, 'San Isidro', 'Rural', 1, '31044356', 'Buena', 1, '', 2, '', 3, '', 'Si', 'Si', 1, 1, 1, 1, 1, 1, 'Si', 'Si', 1, '', 2, '', 3, '', 4, '', 'Dentro de la Vivienda', 1, ''),
(5, 55, 1, '', NULL, NULL, 'Refugio', 'Rural', 1, '310423456', 'Buena', 1, '', 2, '', 3, '', 'Si', 'Si', 3, 2, 2, 2, 2, 2, 'Si', 'Si', 1, '', 2, '', 3, '', 4, '', 'Dentro de la Vivienda', 1, ''),
(6, 56, 1, '', NULL, NULL, 'Puente', 'Rural', 1, '234512', 'Buena', 1, '', 2, '', 3, '', 'Si', 'Si', 3, 3, 3, 3, 3, 3, 'Si', 'Si', 1, '', 2, '', 3, '', 4, '', 'Dentro de la Vivienda', 1, ''),
(7, 57, 1, '', NULL, NULL, 'fresa', 'Rural', 1, '231', 'Buena', 1, '', 2, '', 3, '', 'No', 'Si', 3, 3, 3, 3, 3, 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(8, 58, 1, '', NULL, NULL, 'San Juan', 'Rural', 1, '23456', 'Buena', 1, '', 2, '', 3, '', 'Si', 'Si', 3, 3, 3, 3, 3, 3, 'Si', 'Si', 1, '', 2, '', 3, '', 4, '', 'Dentro de la Vivienda', 1, ''),
(9, 59, 1, '', NULL, NULL, 'Rentador', 'Rural', 1, '12334', 'Buena', 1, '', 2, '', 3, '', 'Si', 'Si', 1, 1, 1, 1, 1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(10, 60, 1, '', NULL, NULL, 'Los Pinos', 'Rural', 1, '345678', 'Buena', 1, '', 2, '', 3, '', 'Si', 'Si', 3, 4, 4, 4, 4, 4, 'Si', 'Si', 1, '', 2, '', 3, '', 4, '', 'Dentro de la Vivienda', 1, ''),
(11, 62, NULL, NULL, NULL, 1, 'Res', 'Rural', 1, '325', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(12, 64, NULL, NULL, NULL, 1, 'Jeres', 'Rural', 1, '123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(13, 65, 1, '', NULL, 1, 'Antonio', 'Rural', 1, '789', 'Buena', 1, '', 10, '', 16, '', 'Si', 'Si', 1, 1, 1, 1, 1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `id` int(11) NOT NULL,
  `id_tipo_servicio` int(11) NOT NULL,
  `descripcion` mediumtext COLLATE utf8_bin
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`id`, `id_tipo_servicio`, `descripcion`) VALUES
(1, 1, 'Acueducto'),
(2, 1, 'Pozo'),
(3, 1, 'Rio'),
(4, 1, 'Otro'),
(5, 2, 'Gas Natural'),
(6, 2, 'Gas Propano'),
(7, 2, 'Electricidad'),
(8, 2, 'Leña'),
(9, 2, 'Otro'),
(10, 3, 'Servicio de Aseo'),
(11, 3, 'La Entierran'),
(12, 3, 'La Queman'),
(13, 3, 'Otro'),
(14, 4, 'Inodoro'),
(15, 4, 'Pozo Septico'),
(16, 4, 'Letrina'),
(17, 4, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tenencia_vivienda`
--

CREATE TABLE `tenencia_vivienda` (
  `id` int(11) NOT NULL,
  `tipo_tenencia` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tenencia_vivienda`
--

INSERT INTO `tenencia_vivienda` (`id`, `tipo_tenencia`) VALUES
(1, 'Propia'),
(2, 'Arriendo'),
(3, 'Familiar'),
(4, 'Prestada'),
(5, 'La cuidan'),
(6, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_escolaridad`
--

CREATE TABLE `tipos_escolaridad` (
  `id` int(11) NOT NULL,
  `escolaridad` varchar(50) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tipos_escolaridad`
--

INSERT INTO `tipos_escolaridad` (`id`, `escolaridad`, `abreviatura`) VALUES
(1, 'Ninguna', 'Ning'),
(2, 'Primaria', 'Prim'),
(3, 'Secundaria', 'Secn'),
(4, 'Tecnico', 'Tecn'),
(5, 'Tecnologico', 'Tecg'),
(6, 'Universitario', 'Univ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_identificacion`
--

CREATE TABLE `tipos_identificacion` (
  `id` int(11) NOT NULL,
  `tipo_identificacion` varchar(100) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tipos_identificacion`
--

INSERT INTO `tipos_identificacion` (`id`, `tipo_identificacion`, `abreviatura`) VALUES
(1, 'Cedula', 'Ced'),
(2, 'R.Civil', 'RCiv'),
(3, 'Pasaporte', 'Pasp'),
(4, 'Ced.Extranjeria', 'CeEx');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_materiales`
--

CREATE TABLE `tipos_materiales` (
  `id` int(11) NOT NULL,
  `tipo` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tipos_materiales`
--

INSERT INTO `tipos_materiales` (`id`, `tipo`) VALUES
(1, 'Material Pared'),
(2, 'Material Piso'),
(3, 'Material Techo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_poblacion`
--

CREATE TABLE `tipos_poblacion` (
  `id` int(11) NOT NULL,
  `tipo` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tipos_poblacion`
--

INSERT INTO `tipos_poblacion` (`id`, `tipo`) VALUES
(1, 'Afrodescendiente'),
(2, 'Desplazado'),
(3, 'Indigena'),
(4, 'ROM'),
(5, 'Ninguno');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_servicio`
--

CREATE TABLE `tipos_servicio` (
  `id` int(11) NOT NULL,
  `tipo_servicio` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tipos_servicio`
--

INSERT INTO `tipos_servicio` (`id`, `tipo_servicio`) VALUES
(1, 'Obtencion de Agua'),
(2, 'Combustible'),
(3, 'Eliminacion de Basuras'),
(4, 'Servicio Sanitario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_vivienda`
--

CREATE TABLE `tipos_vivienda` (
  `id` int(11) NOT NULL,
  `tipo_vivienda` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `tipos_vivienda`
--

INSERT INTO `tipos_vivienda` (`id`, `tipo_vivienda`) VALUES
(1, 'Casa'),
(2, 'Apartamento'),
(3, 'Cuarto'),
(4, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombres` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `apellidos` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(100) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombres`, `apellidos`, `username`, `password`) VALUES
(1, 'admin', 'admin', 'admin', 'admin'),
(2, 'Carlos', 'Chavez', 'charlie', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_pais` (`id_pais`);

--
-- Indices de la tabla `encuestas`
--
ALTER TABLE `encuestas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `estados_civiles`
--
ALTER TABLE `estados_civiles`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `grupos_convivientes`
--
ALTER TABLE `grupos_convivientes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `ingresos_mensuales`
--
ALTER TABLE `ingresos_mensuales`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `materiales`
--
ALTER TABLE `materiales`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_tipo_material` (`id_tipo_material`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_departamento` (`id_departamento`);

--
-- Indices de la tabla `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_tipo_identificacion` (`id_tipo_identificacion`,`id_lugar_expedicion`,`id_lugar_nacimiento`,`id_estado_civil`,`id_grupo_conviviente`,`id_escolaridad`,`id_tipo_poblacion`,`id_ingreso_mensual`,`id_encuesta`),
  ADD KEY `id_lugar_expedicion` (`id_lugar_expedicion`),
  ADD KEY `id_lugar_nacimiento` (`id_lugar_nacimiento`),
  ADD KEY `id_estado_civil` (`id_estado_civil`),
  ADD KEY `id_grupo_conviviente` (`id_grupo_conviviente`),
  ADD KEY `id_escolaridad` (`id_escolaridad`),
  ADD KEY `id_tipo_poblacion` (`id_tipo_poblacion`),
  ADD KEY `id_ingreso_mensual` (`id_ingreso_mensual`),
  ADD KEY `id_encuesta` (`id_encuesta`);

--
-- Indices de la tabla `persona_vivienda`
--
ALTER TABLE `persona_vivienda`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_persona` (`id_persona`,`id_tipo_vivienda`,`id_departamento`,`id_municipio`,`id_material_pared`,`id_material_piso`,`id_material_techo`,`id_obtencion_agua`,`id_combustible_cocina`,`id_elm_basura`,`id_servicio_sanitario`,`id_tenencia_vivienda`),
  ADD KEY `id_tipo_vivienda` (`id_tipo_vivienda`),
  ADD KEY `id_departamento` (`id_departamento`),
  ADD KEY `id_municipio` (`id_municipio`),
  ADD KEY `id_material_pared` (`id_material_pared`),
  ADD KEY `id_material_piso` (`id_material_piso`),
  ADD KEY `id_material_techo` (`id_material_techo`),
  ADD KEY `id_obtencion_agua` (`id_obtencion_agua`),
  ADD KEY `id_combustible_cocina` (`id_combustible_cocina`),
  ADD KEY `id_elm_basura` (`id_elm_basura`),
  ADD KEY `id_servicio_sanitario` (`id_servicio_sanitario`),
  ADD KEY `id_tenencia_vivienda` (`id_tenencia_vivienda`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_tipo_servicio` (`id_tipo_servicio`);

--
-- Indices de la tabla `tenencia_vivienda`
--
ALTER TABLE `tenencia_vivienda`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_escolaridad`
--
ALTER TABLE `tipos_escolaridad`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_identificacion`
--
ALTER TABLE `tipos_identificacion`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_materiales`
--
ALTER TABLE `tipos_materiales`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_poblacion`
--
ALTER TABLE `tipos_poblacion`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_servicio`
--
ALTER TABLE `tipos_servicio`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_vivienda`
--
ALTER TABLE `tipos_vivienda`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT de la tabla `encuestas`
--
ALTER TABLE `encuestas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `estados_civiles`
--
ALTER TABLE `estados_civiles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `grupos_convivientes`
--
ALTER TABLE `grupos_convivientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `ingresos_mensuales`
--
ALTER TABLE `ingresos_mensuales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `materiales`
--
ALTER TABLE `materiales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT de la tabla `municipios`
--
ALTER TABLE `municipios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `paises`
--
ALTER TABLE `paises`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;
--
-- AUTO_INCREMENT de la tabla `persona_vivienda`
--
ALTER TABLE `persona_vivienda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT de la tabla `tenencia_vivienda`
--
ALTER TABLE `tenencia_vivienda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `tipos_escolaridad`
--
ALTER TABLE `tipos_escolaridad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `tipos_identificacion`
--
ALTER TABLE `tipos_identificacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tipos_materiales`
--
ALTER TABLE `tipos_materiales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `tipos_poblacion`
--
ALTER TABLE `tipos_poblacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tipos_servicio`
--
ALTER TABLE `tipos_servicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tipos_vivienda`
--
ALTER TABLE `tipos_vivienda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD CONSTRAINT `departamentos_ibfk_1` FOREIGN KEY (`id_pais`) REFERENCES `paises` (`id`);

--
-- Filtros para la tabla `encuestas`
--
ALTER TABLE `encuestas`
  ADD CONSTRAINT `encuestas_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `materiales`
--
ALTER TABLE `materiales`
  ADD CONSTRAINT `materiales_ibfk_1` FOREIGN KEY (`id_tipo_material`) REFERENCES `tipos_materiales` (`id`);

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `municipios_ibfk_1` FOREIGN KEY (`id_departamento`) REFERENCES `departamentos` (`id`);

--
-- Filtros para la tabla `personas`
--
ALTER TABLE `personas`
  ADD CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`id_tipo_identificacion`) REFERENCES `tipos_identificacion` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personas_ibfk_3` FOREIGN KEY (`id_lugar_nacimiento`) REFERENCES `municipios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personas_ibfk_4` FOREIGN KEY (`id_estado_civil`) REFERENCES `estados_civiles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personas_ibfk_5` FOREIGN KEY (`id_grupo_conviviente`) REFERENCES `grupos_convivientes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personas_ibfk_6` FOREIGN KEY (`id_escolaridad`) REFERENCES `tipos_escolaridad` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personas_ibfk_7` FOREIGN KEY (`id_tipo_poblacion`) REFERENCES `tipos_poblacion` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personas_ibfk_8` FOREIGN KEY (`id_ingreso_mensual`) REFERENCES `ingresos_mensuales` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personas_ibfk_9` FOREIGN KEY (`id_encuesta`) REFERENCES `encuestas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `persona_vivienda`
--
ALTER TABLE `persona_vivienda`
  ADD CONSTRAINT `persona_vivienda_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_10` FOREIGN KEY (`id_elm_basura`) REFERENCES `servicios` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_11` FOREIGN KEY (`id_servicio_sanitario`) REFERENCES `servicios` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_12` FOREIGN KEY (`id_tenencia_vivienda`) REFERENCES `tenencia_vivienda` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_2` FOREIGN KEY (`id_tipo_vivienda`) REFERENCES `tipos_vivienda` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_3` FOREIGN KEY (`id_departamento`) REFERENCES `departamentos` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_4` FOREIGN KEY (`id_municipio`) REFERENCES `municipios` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_5` FOREIGN KEY (`id_material_pared`) REFERENCES `materiales` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_6` FOREIGN KEY (`id_material_piso`) REFERENCES `materiales` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_7` FOREIGN KEY (`id_material_techo`) REFERENCES `materiales` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_8` FOREIGN KEY (`id_obtencion_agua`) REFERENCES `servicios` (`id`),
  ADD CONSTRAINT `persona_vivienda_ibfk_9` FOREIGN KEY (`id_combustible_cocina`) REFERENCES `servicios` (`id`);

--
-- Filtros para la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `servicios_ibfk_1` FOREIGN KEY (`id_tipo_servicio`) REFERENCES `tipos_servicio` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
