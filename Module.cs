using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace FMS.Models
{
    public class Module
    {
        public int ID { get; set; }
        public string Name { get; set; }

        public Module(int id, string name)
        {
            this.ID = id;
            this.Name = name;
        }
    }
}