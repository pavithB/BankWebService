-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2017 at 11:28 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_Id` int(4) NOT NULL,
  `emp_Name` varchar(25) NOT NULL,
  `emp_Position` varchar(50) NOT NULL,
  `emp_UserName` varchar(25) NOT NULL,
  `emp_PassWord` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_Id`, `emp_Name`, `emp_Position`, `emp_UserName`, `emp_PassWord`) VALUES
(1, 'Kokulan', 'manager', 'k', '123'),
(5, 'Pavith', 'Ass Manager', 'pavi', '456'),
(6, 'Menusha', 'Senior Manager', 'menu', 'qwe'),
(7, 'ok', 'ok', 'ok', 'ok'),
(8, 'po', 'po', 'po', 'po'),
(9, '', '', '', ''),
(10, '454', '', '', ''),
(11, 'hj', 'ert', 'we', '123'),
(12, 'er', 'er', 'we', 'we'),
(13, 'rt', 'rt', 'rt', 'rt'),
(14, 'op', 'op', 'op', 'op');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `emp_Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
