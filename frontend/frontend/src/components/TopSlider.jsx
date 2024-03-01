import Carousel from 'react-bootstrap/Carousel';
//import Footer from './Footer';

function TopSlider() {
    return (
        <div>
            <Carousel>
                <Carousel.Item interval={1000}>
                    <img
                        className="d-block w-100 h-30"
                        src={'https://www.ethnicplus.in/media/mageplaza/bannerslider/banner/image/1/0/10_5.jpg'}
                        alt="First slide"
                    />
                </Carousel.Item>
                <Carousel.Item interval={1500}>
                    <img
                        className="d-block w-100 h-30"
                        src={'https://www.ethnicplus.in/media/mageplaza/bannerslider/banner/image/1/2/12_4.jpg'}
                        alt="Second slide"
                    />
                </Carousel.Item>
                <Carousel.Item interval={1500}>
                    <img
                        className="d-block w-100 h-30"
                        src={'https://www.ethnicplus.in/media/mageplaza/bannerslider/banner/image/9/_/9_8.jpg'}
                        alt="Second slide"
                    />
                </Carousel.Item>
                <Carousel.Item interval={1500}>
                    <img
                        className="d-block w-100 h-30"
                        src={'https://www.ethnicplus.in/media/mageplaza/bannerslider/banner/image/1/1/11_4.jpg'}
                        alt="Second slide"
                    />
                </Carousel.Item>
            </Carousel>
            {/* <Footer /> */}
        </div>
    );
}

export default TopSlider;
