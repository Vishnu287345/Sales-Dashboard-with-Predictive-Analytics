const Footer = () => {
  return (
    <footer className="footer mt-auto py-3 bg-dark">
      <div className="container">
        <p className="text-light">
          App developed by
          <a href="https://github.com/jocile" target="_blank" rel="noreferrer">
            Jocile
          </a>
        </p>
        <p className="text-light">
          <small><strong>Spring React week
          </strong><br />
            Event promoted by the DevSuperior school:
            <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">
              @devsuperior.ig
            </a>
          </small>
        </p>
      </div>
    </footer>
  );
}

export default Footer;