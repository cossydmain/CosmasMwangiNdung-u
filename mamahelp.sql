-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2019 at 09:45 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mamahelp`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `id` int(11) NOT NULL,
  `firstname` varchar(50) DEFAULT NULL,
  `surname` varchar(50) DEFAULT NULL,
  `password` int(10) NOT NULL,
  `location` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `firstname`, `surname`, `password`, `location`) VALUES
(4, 'Onyango', 'Abila', 1, '123'),
(6, 'Cossy', 'Dmain', 0, 'karen'),
(14, 'jane', 'wangui', 0, 'kasarani'),
(16, 'mike', 'mwangi', 0, 'kisii'),
(22, 'Joan', 'Mwangi', 0, 'juja'),
(23, 'Joan', 'Mwangi', 0, 'juja'),
(24, 'Antoinette', 'Owinyo', 0, 'juja'),
(25, 'Cossy', 'Dmain', 0, 'sbbsnsn'),
(27, 'lgjgh', 'cjvgkvb', 0, 'dvxhbln'),
(34, 'Cossy', 'Dmain', 0, 'juja'),
(37, 'Cossy', 'Dmain', 0, 'Cossy'),
(38, 'Cossy', 'Cossy', 0, 'Onyango'),
(39, 'Cossy', 'Cossy', 0, 'Onyango'),
(41, 'Cossy', 'Dmain', 0, 'dggfgch'),
(43, 'Cossy', 'Dmain', 0, 'Cossy'),
(44, 'john', 'doe', 0, 'juja'),
(45, 'jane', 'doe', 0, 'juja'),
(46, 'jane', 'doe', 0, 'juja'),
(47, 'jane', 'doe', 0, 'juja'),
(48, 'Cossy', 'Dmain', 0, 'fshfgh'),
(49, 'Cossy', 'Dmain', 0, 'fshfgh'),
(50, 'dorcas', 'wamuyu', 0, 'jsbsjsbs'),
(51, 'cossy', 'Dmain', 0, 'you');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
