using System;
namespace ConsoleAppProject.App02
{
    /// <summary>
    /// This app converts one distance type to another e.g. miles to feet
    /// </summary>
    /// <author>
    /// Sean Hindle version 0.1
    /// </author>
    public class DistanceConverter
    {
        private double miles;

        private double feet;

        public void Run()
        {
            InputMiles();
            CalculateFeet();
            OutputFeet();
        }
        /// <summary>
        /// Prompt the user to enter the distance in miles
        /// Input the miles as a double number
        /// </summary>
        private void InputMiles()
        {
            Console.Write("Enter the number of miles: ");
            string value = Console.ReadLine();
            miles = Convert.ToDouble(value);
        }

        private void CalculateFeet()
        {
            feet = miles * 5280;
        }

        private void OutputFeet()
        {
            Console.WriteLine(miles + " miles is " + feet + " feet!");
        }

    }
}
