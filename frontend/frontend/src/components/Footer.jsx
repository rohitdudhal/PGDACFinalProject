import React from "react";
import "../css/home.css";
import { Link } from "react-router-dom";

function Footer() {
    return (
        <div>
            <footer className="bg-dark text-white pt-5 pb-4">
                <div className="container text-center text-md-left">
                    <div className="row text-center text-md-left">
                        <div className="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
                            <h5 className="text-uppercase mb-4 font-weight-bold text-warning">
                                clothstore.com
                            </h5>
                            <p>
                                Stray Animal Foundation of India is a 501(c)3 charitable
                                organization, and all donations to help India’s stray animals.
                                We are currently working only in four cities for now i.e
                                Mumbai,Hyderabad,Pune and Banglore
                            </p>
                        </div>

                        <div className="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
                            <h5 className="text-uppercase mb-4 font-weight-bold text-warning">
                                Information
                            </h5>
                            <p>
                                <a href="https://www.worldanimalprotection.org.in/news" className="text-white">
                                    News
                                </a>
                            </p>
                            <p>
                                <a href="https://www.worldanimalprotection.org.in/blogs" className="text-white">
                                    Blogs
                                </a>
                            </p>
                        </div>

                        <div className="col-md-3 col-lg-2 col-xl-2 mx-auto mt-3">
                            <h5 className="text-uppercase mb-4 font-weight-bold text-warning">
                                Useful links
                            </h5>
                            <p>
                                <Link to="/home" className="text-white">
                                    HOME
                                </Link>
                            </p>
                            <p>
                                <Link to="/complaint" className="text-white">
                                    COMPLAINT
                                </Link>
                            </p>
                            <p>
                                <Link to="/useradopt" className="text-white">
                                    ADOPT
                                </Link>
                            </p>
                            <p>
                                <Link to="/profile" className="text-white">
                                    PROFILE
                                </Link>
                            </p>
                        </div>

                        <div className="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">
                            <h5 className="text-uppercase mb-4 font-weight-bold text-warning">
                                Contact
                            </h5>
                            <p>
                                <i className="fa fa-home mr-3"></i>Khargar, Mumbai
                            </p>
                            <p>
                                <i className="fa fa-envelope mr-3"></i>sds@gmail.com
                            </p>
                            <p>
                                <i className="fa fa-phone mr-3"></i>+91 9821427992
                            </p>
                            <p>
                                <i className="fa fa-phone mr-3"></i>+91 9967322392
                            </p>
                        </div>
                    </div>

                    <hr className="mb-4" />

                    <div className="row align-items-center">
                        <div className="col-md-7 col-lg-12 m-auto">
                            <p>
                                Copyright ©2024 All rights reserved by:
                                <a href="#">
                                    <strong className="text-warning">CDAC</strong>
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </footer>
        </div>
    );
}

export default Footer;
