CREATE TABLE `natillera`.`Personas` (
    IdPersona INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Nombres VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(50) NULL,
    TipoDocumento VARCHAR(25) NULL,
    NumeroDocumento VARCHAR(20) NULL,
    Celular VARCHAR(50) NULL,
    Correo VARCHAR(50) NULL,
    FechaIngreso DATE NULL,
    Activo BIT NOT NULL,
    UNIQUE INDEX idx_NumeroDocumento (NumeroDocumento)
  );

CREATE TABLE `natillera`.`Natillera` (
    IdNatillera INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    FechaInicio DATE NULL ,
    FechaFin DATE NULL ,
    Activo BIT NOT NULL
  );

CREATE TABLE `natillera`.`personasnatillera`(
  `Id` int NOT NULL AUTO_INCREMENT,
  `IdPersona` int DEFAULT NULL,
  `IdNatillera` int DEFAULT NULL,
  `Estado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdPersona_idx` (`IdPersona`),
  KEY `IdNatillera_idx` (`IdNatillera`),
  CONSTRAINT `IdNatillera` FOREIGN KEY (`IdNatillera`) REFERENCES `natillera` (`IdNatillera`),
  CONSTRAINT `IdPersona` FOREIGN KEY (`IdPersona`) REFERENCES `personas` (`IdPersona`)
);

CREATE TABLE `natillera`.`pagosnatillera` (
  `IdPago` int NOT NULL AUTO_INCREMENT,
  `IdPersona` int DEFAULT NULL,
  `IdNatillera` int DEFAULT NULL,
  `TipoPago` varchar(20) DEFAULT NULL,
  `FechaPago` date DEFAULT NULL,
  `Valor` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`IdPago`),
  KEY `IdPersona_idx` (`IdPersona`),
  KEY `IdNatillera_idx` (`IdNatillera`),
  CONSTRAINT `FK_IdNatillera` FOREIGN KEY (`IdNatillera`) REFERENCES `natillera` (`IdNatillera`),
  CONSTRAINT `FK_IdPersona` FOREIGN KEY (`IdPersona`) REFERENCES `personas` (`IdPersona`)
);