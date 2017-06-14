-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 23-06-2016 a las 18:56:35
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `adulto_mayor`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE IF NOT EXISTS `departamentos` (
`id` int(11) NOT NULL,
  `departamento` varchar(100) COLLATE utf8_bin NOT NULL,
  `codigo` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `id_pais` int(11) NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encuestas`
--

CREATE TABLE IF NOT EXISTS `encuestas` (
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

CREATE TABLE IF NOT EXISTS `estados_civiles` (
`id` int(11) NOT NULL,
  `estado_civil` varchar(50) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupos_convivientes`
--

CREATE TABLE IF NOT EXISTS `grupos_convivientes` (
`id` int(11) NOT NULL,
  `grupo` varchar(100) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos_mensuales`
--

CREATE TABLE IF NOT EXISTS `ingresos_mensuales` (
`id` int(11) NOT NULL,
  `ingresos_rango` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

CREATE TABLE IF NOT EXISTS `materiales` (
`id` int(11) NOT NULL,
  `id_tipo_material` int(11) NOT NULL,
  `material` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE IF NOT EXISTS `municipios` (
`id` int(11) NOT NULL,
  `municipio` varchar(100) COLLATE utf8_bin NOT NULL,
  `codigo` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `id_departamento` int(11) NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paises`
--

CREATE TABLE IF NOT EXISTS `paises` (
`id` int(11) NOT NULL,
  `pais` varchar(100) COLLATE utf8_bin NOT NULL,
  `codigo` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE IF NOT EXISTS `personas` (
`id` int(11) NOT NULL,
  `primer_apellido` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `segundo_apellido` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `primer_nombre` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `segundo_nombre` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_tipo_identificacion` int(11) DEFAULT NULL,
  `numero_identificacion` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `id_lugar_expedicion` int(11) DEFAULT NULL,
  `id_lugar_nacimiento` int(11) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
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
  `estilo_vida_saludable` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `adulto_mayor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `grupo_adulto_mayor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `organizacion_comun` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `tipo_ocupacion` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ocupacion` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `caract_ocupacion` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ingresos` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `fuente_ingresos` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_ingreso_mensual` int(11) DEFAULT NULL,
  `prog_colombia_mayor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ayuda_tecnica_usa` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ayuda_tecnica_requiere` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ayuda_tecnica` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_encuesta` int(11) DEFAULT NULL,
  `caract_discapacidad` varchar(100) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_vivienda`
--

CREATE TABLE IF NOT EXISTS `persona_vivienda` (
`id` int(11) NOT NULL,
  `id_persona` int(11) NOT NULL,
  `id_tipo_vivienda` int(11) NOT NULL,
  `otro_tipo_vivienda` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_departamento` int(11) NOT NULL,
  `id_municipio` int(11) NOT NULL,
  `barrio_vereda` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sector` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `estrato` int(2) DEFAULT NULL,
  `direccion` varchar(150) COLLATE utf8_bin DEFAULT NULL,
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE IF NOT EXISTS `servicios` (
`id` int(11) NOT NULL,
  `id_tipo_servicio` int(11) NOT NULL,
  `descripcion` mediumtext COLLATE utf8_bin
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tenencia_vivienda`
--

CREATE TABLE IF NOT EXISTS `tenencia_vivienda` (
`id` int(11) NOT NULL,
  `tipo_tenencia` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_escolaridad`
--

CREATE TABLE IF NOT EXISTS `tipos_escolaridad` (
`id` int(11) NOT NULL,
  `escolaridad` varchar(50) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_identificacion`
--

CREATE TABLE IF NOT EXISTS `tipos_identificacion` (
`id` int(11) NOT NULL,
  `tipo_identificacion` varchar(100) COLLATE utf8_bin NOT NULL,
  `abreviatura` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_materiales`
--

CREATE TABLE IF NOT EXISTS `tipos_materiales` (
`id` int(11) NOT NULL,
  `tipo` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_poblacion`
--

CREATE TABLE IF NOT EXISTS `tipos_poblacion` (
`id` int(11) NOT NULL,
  `tipo` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_servicio`
--

CREATE TABLE IF NOT EXISTS `tipos_servicio` (
`id` int(11) NOT NULL,
  `tipo_servicio` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_vivienda`
--

CREATE TABLE IF NOT EXISTS `tipos_vivienda` (
`id` int(11) NOT NULL,
  `tipo_vivienda` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
`id` int(11) NOT NULL,
  `nombres` varchar(100) COLLATE utf8_bin NOT NULL,
  `apellidos` varchar(100) COLLATE utf8_bin NOT NULL,
  `url_foto` varchar(150) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(150) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(100) COLLATE utf8_bin NOT NULL,
  `estado` int(1) NOT NULL,
  `password` varchar(100) COLLATE utf8_bin NOT NULL,
  `nro_movil` varchar(15) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD KEY `id_pais` (`id_pais`);

--
-- Indices de la tabla `encuestas`
--
ALTER TABLE `encuestas`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `estados_civiles`
--
ALTER TABLE `estados_civiles`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `grupos_convivientes`
--
ALTER TABLE `grupos_convivientes`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `ingresos_mensuales`
--
ALTER TABLE `ingresos_mensuales`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `materiales`
--
ALTER TABLE `materiales`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD KEY `id_tipo_material` (`id_tipo_material`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD KEY `id_departamento` (`id_departamento`);

--
-- Indices de la tabla `paises`
--
ALTER TABLE `paises`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD KEY `id_tipo_identificacion` (`id_tipo_identificacion`,`id_lugar_expedicion`,`id_lugar_nacimiento`,`id_estado_civil`,`id_grupo_conviviente`,`id_escolaridad`,`id_tipo_poblacion`,`id_ingreso_mensual`,`id_encuesta`), ADD KEY `id_lugar_expedicion` (`id_lugar_expedicion`), ADD KEY `id_lugar_nacimiento` (`id_lugar_nacimiento`), ADD KEY `id_estado_civil` (`id_estado_civil`), ADD KEY `id_grupo_conviviente` (`id_grupo_conviviente`), ADD KEY `id_escolaridad` (`id_escolaridad`), ADD KEY `id_tipo_poblacion` (`id_tipo_poblacion`), ADD KEY `id_ingreso_mensual` (`id_ingreso_mensual`), ADD KEY `id_encuesta` (`id_encuesta`);

--
-- Indices de la tabla `persona_vivienda`
--
ALTER TABLE `persona_vivienda`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD KEY `id_persona` (`id_persona`,`id_tipo_vivienda`,`id_departamento`,`id_municipio`,`id_material_pared`,`id_material_piso`,`id_material_techo`,`id_obtencion_agua`,`id_combustible_cocina`,`id_elm_basura`,`id_servicio_sanitario`,`id_tenencia_vivienda`), ADD KEY `id_tipo_vivienda` (`id_tipo_vivienda`), ADD KEY `id_departamento` (`id_departamento`), ADD KEY `id_municipio` (`id_municipio`), ADD KEY `id_material_pared` (`id_material_pared`), ADD KEY `id_material_piso` (`id_material_piso`), ADD KEY `id_material_techo` (`id_material_techo`), ADD KEY `id_obtencion_agua` (`id_obtencion_agua`), ADD KEY `id_combustible_cocina` (`id_combustible_cocina`), ADD KEY `id_elm_basura` (`id_elm_basura`), ADD KEY `id_servicio_sanitario` (`id_servicio_sanitario`), ADD KEY `id_tenencia_vivienda` (`id_tenencia_vivienda`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD KEY `id_tipo_servicio` (`id_tipo_servicio`);

--
-- Indices de la tabla `tenencia_vivienda`
--
ALTER TABLE `tenencia_vivienda`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_escolaridad`
--
ALTER TABLE `tipos_escolaridad`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_identificacion`
--
ALTER TABLE `tipos_identificacion`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_materiales`
--
ALTER TABLE `tipos_materiales`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_poblacion`
--
ALTER TABLE `tipos_poblacion`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_servicio`
--
ALTER TABLE `tipos_servicio`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `tipos_vivienda`
--
ALTER TABLE `tipos_vivienda`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `departamentos`
--
ALTER TABLE `departamentos`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `encuestas`
--
ALTER TABLE `encuestas`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `estados_civiles`
--
ALTER TABLE `estados_civiles`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `grupos_convivientes`
--
ALTER TABLE `grupos_convivientes`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `ingresos_mensuales`
--
ALTER TABLE `ingresos_mensuales`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `materiales`
--
ALTER TABLE `materiales`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `municipios`
--
ALTER TABLE `municipios`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `paises`
--
ALTER TABLE `paises`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_vivienda`
--
ALTER TABLE `persona_vivienda`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tenencia_vivienda`
--
ALTER TABLE `tenencia_vivienda`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipos_escolaridad`
--
ALTER TABLE `tipos_escolaridad`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipos_identificacion`
--
ALTER TABLE `tipos_identificacion`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipos_materiales`
--
ALTER TABLE `tipos_materiales`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipos_poblacion`
--
ALTER TABLE `tipos_poblacion`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipos_servicio`
--
ALTER TABLE `tipos_servicio`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipos_vivienda`
--
ALTER TABLE `tipos_vivienda`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
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
ADD CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`id_tipo_identificacion`) REFERENCES `tipos_identificacion` (`id`),
ADD CONSTRAINT `personas_ibfk_2` FOREIGN KEY (`id_lugar_expedicion`) REFERENCES `municipios` (`id`),
ADD CONSTRAINT `personas_ibfk_3` FOREIGN KEY (`id_lugar_nacimiento`) REFERENCES `municipios` (`id`),
ADD CONSTRAINT `personas_ibfk_4` FOREIGN KEY (`id_estado_civil`) REFERENCES `estados_civiles` (`id`),
ADD CONSTRAINT `personas_ibfk_5` FOREIGN KEY (`id_grupo_conviviente`) REFERENCES `grupos_convivientes` (`id`),
ADD CONSTRAINT `personas_ibfk_6` FOREIGN KEY (`id_escolaridad`) REFERENCES `tipos_escolaridad` (`id`),
ADD CONSTRAINT `personas_ibfk_7` FOREIGN KEY (`id_tipo_poblacion`) REFERENCES `tipos_poblacion` (`id`),
ADD CONSTRAINT `personas_ibfk_8` FOREIGN KEY (`id_ingreso_mensual`) REFERENCES `ingresos_mensuales` (`id`),
ADD CONSTRAINT `personas_ibfk_9` FOREIGN KEY (`id_encuesta`) REFERENCES `encuestas` (`id`);

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
