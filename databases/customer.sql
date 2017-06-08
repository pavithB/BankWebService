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
-- Database: `customer`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cus_Id` int(11) NOT NULL,
  `cus_Name` varchar(25) NOT NULL,
  `cus_Dob` varchar(25) NOT NULL,
  `cus_Address` varchar(50) NOT NULL,
  `cus_Mobile` varchar(15) NOT NULL,
  `cus_Email` varchar(45) NOT NULL,
  `cus_AccType` varchar(10) NOT NULL,
  `cus_AccNo` varchar(20) NOT NULL,
  `cus_AccSortCode` varchar(25) NOT NULL,
  `cus_AccBalance` decimal(10,2) NOT NULL,
  `cus_CardNo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cus_Id`, `cus_Name`, `cus_Dob`, `cus_Address`, `cus_Mobile`, `cus_Email`, `cus_AccType`, `cus_AccNo`, `cus_AccSortCode`, `cus_AccBalance`, `cus_CardNo`) VALUES
(1, 'Kokulan', '1995-03-27', '11,Mayfield Road,Colombo-11', '0774585123', 'ttkokulan@gmail.com', 'Major', 'a879782561', 'b145236', '2563.23', '145115465879'),
(2, 'Pavith', '1995-05-28', '25,Nawal Road,Kadawela', '0771234598', 'pavith@gmail.com', 'Major', 'd154536565', 'e1148986', '25983.14', '121215454'),
(3, 'we', '0000-00-00', 'qeqw', 'qweq', 'qeqe', 'wqe', 'qwe', 'qweq', '127.45', 'wqeqw'),
(4, 'name', '1995-06-25', 'address', 'mobileNo', 'email', 'cusAcc', 'cusAccNo', 'sortCode', '12.50', 'cardNo'),
(5, 'name', '1995-06-25', 'address', 'mobileNo', 'email', 'cusAcc', 'cusAccNo', 'sortCode', '12.50', 'cardNo'),
(6, 'sdf', '1995-05-02', 'adasd', '51515', 'asdsad', 'sdf', 'dfsdf', 'afasd', '12.25', 'asdasd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cus_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cus_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
