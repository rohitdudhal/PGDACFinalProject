import React from 'react';
import '../static/About.css';
import Logo from "../static/Chairs.jpeg";
import Logo1 from "../static/hall.jpeg";
import Logo2 from "../static/sofa.jpeg";

function About() {
    return (
        <>
            <main role="main">


                <div className="container about_us">
                    <div className="jumbotron ">
                        <div className="container back">
                            <h1 className="display-3 ms-5"><b>Let us be your Shopping to the world.</b></h1>
                            <p> 
                            </p>
                        </div>
                    </div>
                </div>
                <div className="container about_text">

                    <div className="row">
                        <div className="col-md-4  ">
                            <div className="text-center mt-2">
                                <img src={'https://cdn-icons-png.flaticon.com/512/524/524516.png'} alt={"Logo"} className="bd-placeholder-img rounded-circle " width="140" height="140" />
                                <h2>Vision</h2>
                            </div>
                            <p className="justify">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Non qui eligendi voluptate delectus culpa, omnis in accusamus veritatis asperiores beatae natus iste expedita ratione repellat sed obcaecati assumenda ea at quis. Rem reiciendis culpa distinctio aliquid excepturi? Excepturi atque cupiditate mollitia! Iure assumenda consequuntur fugiat optio et porro culpa tempora?
                            </p>

                        </div>
                        <div className="col-md-4  ">
                            <div className="text-center mt-2">
                                <img src={'https://cdn-icons-png.flaticon.com/512/4622/4622726.png'} alt={"Logo"} className="bd-placeholder-img rounded-circle" width="140" height="140" />
                                <h2>Mission</h2>
                            </div>
                            <p className="justify">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Non qui eligendi voluptate delectus culpa, omnis in accusamus veritatis asperiores beatae natus iste expedita ratione repellat sed obcaecati assumenda ea at quis. Rem reiciendis culpa distinctio aliquid excepturi? Excepturi atque cupiditate mollitia! Iure assumenda consequuntur fugiat optio et porro culpa tempora?
                            </p>

                        </div>
                        <div className="col-md-4  ">
                            <div className="text-center mt-2">
                                <img src={'https://cdn-icons-png.flaticon.com/512/8776/8776768.png'} alt={"Logo"} className="bd-placeholder-img rounded-circle" width="140" height="140" />
                                <h2>Why ClothStore.com</h2>
                            </div>
                            <p className="d-flex justify-content-start">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Non qui eligendi voluptate delectus culpa, omnis in accusamus veritatis asperiores beatae natus iste expedita ratione repellat sed obcaecati assumenda ea at quis. Rem reiciendis culpa distinctio aliquid excepturi? Excepturi atque cupiditate mollitia! Iure assumenda consequuntur fugiat optio et porro culpa tempora?

                            </p>
                        </div>
                    </div>

                    <hr />

                </div>

            </main>
        </>
    );
}

export default About;